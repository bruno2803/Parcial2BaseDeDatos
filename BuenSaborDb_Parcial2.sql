CREATE DATABASE BuenSaborDb;

USE BuenSaborDb;

/* PROCEDIMIENTOS */

/* 1-Realizar un procedimiento que realice listado de venta por mes para un año que se pasa por parámetro. El listado debe mostrar:
•	Año – Mes
•	Sucursal
•	Categoria
•	Articulo
•	Cantidad vendida
•	Precio Unitario
•	Total de venta (cantidad vendida * precio unitario)
•	Costo
•	Ganancia total (Total de venta – Costo total (costo * cantidad vendida)
Ordenado por Sucursal, mes.
*/

DELIMITER //

CREATE PROCEDURE ListadoVentasPorMes(IN anio INT)
BEGIN
    SELECT
        DATE_FORMAT(p.fecha_pedido, '%Y-%m') AS 'Año - Mes',
        s.nombre AS Sucursal,
        c.denominacion AS Categoria,
        a.denominacion AS Articulo,
        SUM(dp.cantidad) AS Cantidad_Vendida,
        a.precio_venta AS Precio_Unitario,
        SUM(dp.cantidad * a.precio_venta) AS Total_Venta,
        a.precio_compra AS Costo,
        SUM(dp.cantidad * (a.precio_venta - a.precio_compra)) AS Ganancia_Total
    FROM
        pedido p
        JOIN detalle_pedido dp ON p.id = dp.pedido_id
        JOIN articulo_insumo a ON dp.articulo_id = a.id
        JOIN categoria c ON a.categoria_id = c.id
        JOIN sucursal s ON p.sucursal_id = s.id
    WHERE
        YEAR(p.fecha_pedido) = anio
    GROUP BY
        s.nombre,
        DATE_FORMAT(p.fecha_pedido, '%Y-%m'),
        c.denominacion,
        a.denominacion,
        a.precio_venta,
        a.precio_compra
    ORDER BY
        s.nombre,
        DATE_FORMAT(p.fecha_pedido, '%Y-%m');
END //

DELIMITER ;

-- Llamada al procedimiento
CALL ListadoVentasPorMes(2023);

/* 3-	Realizar un procedimiento que actualice un artículo manufacturado, para cambiar alguna receta. 
Se debe pasar porparámetro el articulo manufacturado, el articulo a cambiar y  la cantidad. Si el articulo no existe dentro del articulo manufacturado, agregegarlo.*/



/* FUNCIONES */

/* 1-	Generar una función que valide que stock hay de un articulo. función se debe usar como:
Select articulo,  funcionValidarStock(articulo) from …
Debe devolver que stock tiene
 */
 
DELIMITER //

CREATE FUNCTION funcionValidarStock(nombre_articulo VARCHAR(100)) RETURNS INT
deterministic
BEGIN
    DECLARE stock_actual INT;
    
    SELECT a.stock_actual
    INTO stock_actual
    FROM articulo_insumo a
    WHERE a.denominacion = nombre_articulo;

    RETURN stock_actual;
END //

DELIMITER ;

-- Llamada a la funcion
SELECT denominacion AS articulo_insumo, funcionValidarStock(denominacion) AS stock
FROM articulo_insumo;

/* 2-	Generar una función que verifique el estado pedido, recibe nro de pedido y devuelve el estado que tiene. 
La función se debe usar para poder listar todos los pedidos de una fecha en particular, y deberá devolver el estado en el que se encuentra */

DELIMITER //

CREATE FUNCTION funcionVerificarEstado(nro_pedido INT) RETURNS VARCHAR(50)
READS SQL DATA
BEGIN
    DECLARE estado_pedido VARCHAR(50);
    
    SELECT p.estado
    INTO estado_pedido
    FROM pedido p
    WHERE p.id = nro_pedido;

    RETURN estado_pedido;
END //

DELIMITER ;

-- Llamada a la funcion
SELECT 
    id AS numero_pedido, 
    fecha_pedido, 
    funcionVerificarEstado(id) AS estado
FROM 
    pedido
WHERE 
    fecha_pedido = '2024-04-18';
    
/* TRIGGERS */

/* 1-	Generar un trigger de update de auditoría de estado de pedidos.  
Cuando se cargue un pedido, guarda en otra tabla el estado anterior del pedido colocando en que fecha se hizo el cambio y que usuario que lo hizo.*/

CREATE TABLE IF NOT EXISTS pedido_estado_aud (
    id INT AUTO_INCREMENT PRIMARY KEY,
    pedido_id BIGINT,
    estado_anterior VARCHAR(255),
    estado_nuevo VARCHAR(255),
    fecha_cambio DATETIME,
    usuario_id BIGINT,
    FOREIGN KEY (pedido_id) REFERENCES pedido(id),
    FOREIGN KEY (usuario_id) REFERENCES usuario_empleado(id)
);

DELIMITER //

CREATE TRIGGER trg_update_pedido_estado
BEFORE UPDATE ON pedido
FOR EACH ROW
BEGIN
    DECLARE usuario_actual INT;

    -- Obtener el usuario que hizo el cambio
    SELECT id INTO usuario_actual FROM usuario_empleado WHERE auth0id = SUBSTRING_INDEX(USER(), '@', 1);

    IF OLD.estado <> NEW.estado THEN
        INSERT INTO pedido_estado_aud (
            pedido_id,
            estado_anterior,
            estado_nuevo,
            fecha_cambio,
            usuario_id
        ) VALUES (
            OLD.id,
            OLD.estado,
            NEW.estado,
            NOW(),
            usuario_actual
        );
    END IF;
END;
//

DELIMITER ;

/* 2-	Generar un trigger de Update cada vez que se cambie un producto manufacturado, copie la información del producto manufacturado en otra tabla, agregando fecha y hora del cambio.*/

CREATE TABLE IF NOT EXISTS producto_manufacturado_aud (
    id INT AUTO_INCREMENT PRIMARY KEY,
    producto_id BIGINT,
    nombre VARCHAR(255),
    descripcion TEXT,
    fecha_cambio DATETIME,
    FOREIGN KEY (producto_id) REFERENCES articulo_manufacturado(id)
);

DELIMITER //

CREATE TRIGGER trg_update_producto_manufacturado
BEFORE UPDATE ON articulo_manufacturado
FOR EACH ROW
BEGIN
    -- Insertar en la tabla de auditoría
    INSERT INTO producto_manufacturado_aud (
        producto_id,
        nombre,
        descripcion,
        fecha_cambio
    ) VALUES (
        OLD.id,
        OLD.denominacion,
        OLD.descripcion,
        NOW()
    );
END;
//

DELIMITER ;

/*VISTAS*/

/* 1-	Armar una vista de los artículos que tienen bajo el stock */

CREATE VIEW articulos_bajo_stock AS
SELECT id, denominacion, stock_actual
FROM articulo_insumo
WHERE stock_actual < 10;

-- Llamada a la vista
SELECT * FROM articulos_bajo_stock;

/* 2-	Armar una vista de cantidad de artículos vendidos por localidad del cliente agrupados por año – mes. La vista debe filtrar los últimos 6 meses. */

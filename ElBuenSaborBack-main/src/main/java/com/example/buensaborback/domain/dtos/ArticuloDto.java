package com.example.buensaborback.domain.dtos;

import com.example.buensaborback.domain.entities.*;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = ArticuloInsumoDto.class, name = "insumo"),
        @JsonSubTypes.Type(value = ArticuloManufacturadoDto.class, name = "manufacturado")
})
public abstract class ArticuloDto extends BaseDto{

    protected String denominacion;
    protected Double precioVenta;
    protected Set<ImagenArticulo> imagenes = new HashSet<>();
    protected UnidadMedida unidadMedida;
    protected Categoria categoria;
    protected Set<DetallePedido> detallePedidos = new HashSet<>();
    protected Set<PromocionDetalle> promocionDetalles = new HashSet<>();

}

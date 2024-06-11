package com.example.buensaborback.domain.dtos;

import com.example.buensaborback.domain.entities.ArticuloManufacturadoDetalle;
import com.example.buensaborback.domain.entities.ImagenArticulo;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ArticuloManufacturadoDto extends ArticuloDto {
    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    private Integer stock;
    private Double precioCosto;
    protected List<ImagenArticulo> imagenesManufacturado;
    private Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles = new HashSet<>();
}

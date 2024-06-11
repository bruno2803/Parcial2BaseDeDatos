package com.example.buensaborback.domain.dtos;

import com.example.buensaborback.domain.entities.ArticuloManufacturadoDetalle;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ArticuloInsumoDto extends ArticuloDto {
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMinimo;
    private Integer stockMaximo;
    private Boolean esParaElaborar;
    private Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles = new HashSet<>();
}

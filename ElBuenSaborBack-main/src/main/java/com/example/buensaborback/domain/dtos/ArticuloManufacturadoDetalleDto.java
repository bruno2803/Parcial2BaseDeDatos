package com.example.buensaborback.domain.dtos;

import com.example.buensaborback.domain.entities.ArticuloInsumo;
import com.example.buensaborback.domain.entities.ArticuloManufacturado;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ArticuloManufacturadoDetalleDto extends BaseDto {
    private Double cantidad;
    private ArticuloInsumo articuloInsumo;
    private ArticuloManufacturado articuloManufacturado;
}

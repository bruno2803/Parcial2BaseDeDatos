package com.example.buensaborback.domain.dtos;

import com.example.buensaborback.domain.entities.ImagenPromocion;
import com.example.buensaborback.domain.entities.PromocionDetalle;
import com.example.buensaborback.domain.entities.Sucursal;
import com.example.buensaborback.domain.enums.TipoPromocion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PromocionDto extends BaseDto{
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;
    private Set<ImagenPromocion> imagenes = new HashSet<>();
    private Set<Sucursal> sucursales = new HashSet<>();
    private Set<PromocionDetalle> promocionDetalles = new HashSet<>();
}

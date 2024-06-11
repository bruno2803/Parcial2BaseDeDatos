package com.example.buensaborback.domain.dtos;

import com.example.buensaborback.domain.entities.*;
import com.example.buensaborback.domain.enums.Estado;
import com.example.buensaborback.domain.enums.FormaPago;
import com.example.buensaborback.domain.enums.TipoEnvio;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDto extends BaseDto{

    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;
    private Domicilio domicilio;
    private Sucursal sucursal;
    private Factura factura;
    private Cliente cliente;
    private Empleado empleado;
    private Set<DetallePedido> detallePedidos = new HashSet<>();

}

package com.example.buensaborback.domain.dtos;


import com.example.buensaborback.domain.entities.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DomicilioDto extends BaseDto {

    private String calle;
    private Integer numero;
    private Integer cp;
    private Localidad localidad;
    private Set<Cliente> clientes = new HashSet<>();
    private Set<Empleado> empleados = new HashSet<>();
    private Sucursal sucursal;
    private Set<Pedido> pedidos = new HashSet<>();

}

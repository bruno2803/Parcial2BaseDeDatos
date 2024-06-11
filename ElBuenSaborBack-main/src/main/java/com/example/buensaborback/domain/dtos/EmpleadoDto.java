package com.example.buensaborback.domain.dtos;

import com.example.buensaborback.domain.entities.*;
import com.example.buensaborback.domain.enums.Rol;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoDto extends BaseDto{

    private Rol rol;
    private Set<Pedido> pedidos = new HashSet<>();
    private Domicilio domicilio;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;
    private UsuarioEmpleado usuario;
    private ImagenEmpleado imagen;
    private Sucursal sucursal;

}

package com.example.buensaborback.domain.dtos;

import com.example.buensaborback.domain.entities.Empleado;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UsuarioEmpleadoDto extends BaseDto{
    private String auth0Id;
    private String username;
    private Empleado empleado;
}

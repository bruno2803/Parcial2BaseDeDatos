package com.example.buensaborback.domain.dtos;

import com.example.buensaborback.domain.entities.UsuarioCliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UsuarioClienteDto extends BaseDto{
    private String auth0Id;
    private String username;
    private UsuarioCliente usuarioCliente;
}

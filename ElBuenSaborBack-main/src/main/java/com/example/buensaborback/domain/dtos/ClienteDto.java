package com.example.buensaborback.domain.dtos;

import com.example.buensaborback.domain.entities.Domicilio;
import com.example.buensaborback.domain.entities.ImagenCliente;
import com.example.buensaborback.domain.entities.Pedido;
import com.example.buensaborback.domain.entities.UsuarioCliente;
import com.example.buensaborback.domain.enums.Rol;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ClienteDto extends BaseDto {
    private Rol rol;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;
    private Set<Pedido> pedidos = new HashSet<>();
    private Set<Domicilio> domicilios = new HashSet<>();
    private UsuarioCliente usuario;
    private ImagenCliente imagen;
}

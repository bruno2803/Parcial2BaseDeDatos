package com.example.buensaborback.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SucursalDto extends BaseDto {

    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private boolean esCasaMatriz;
    private DomicilioDto domicilio;

    private EmpresaDto empresa;


}
package com.example.buensaborback.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmpresaDto extends BaseDto{

    private String nombre;
    private String razonSocial;
    private Long cuil;

}


package com.example.buensaborback.domain.dtos;

import com.example.buensaborback.domain.entities.Empresa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ImagenEmpresaDto extends ImagenDto{
    private Empresa empresa;
}

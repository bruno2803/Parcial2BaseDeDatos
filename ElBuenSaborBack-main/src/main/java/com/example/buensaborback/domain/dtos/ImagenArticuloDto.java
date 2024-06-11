package com.example.buensaborback.domain.dtos;

import com.example.buensaborback.domain.entities.Articulo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ImagenArticuloDto extends BaseDto{

    private String url;
    private Articulo articulo;

}

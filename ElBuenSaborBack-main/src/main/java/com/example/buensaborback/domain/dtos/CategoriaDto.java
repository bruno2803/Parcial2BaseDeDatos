package com.example.buensaborback.domain.dtos;

import com.example.buensaborback.domain.entities.Articulo;
import com.example.buensaborback.domain.entities.Categoria;
import com.example.buensaborback.domain.entities.Sucursal;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CategoriaDto extends BaseDto {
    private Long id;
    private String denominacion;
    private Set<Categoria> subCategorias = new HashSet<>();
    private Categoria categoriaPadre;
    private Set<Sucursal> sucursales = new HashSet<>();
    private Set<Articulo> articulos = new HashSet<>();
}

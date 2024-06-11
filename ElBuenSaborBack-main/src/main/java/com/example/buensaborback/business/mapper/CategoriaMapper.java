package com.example.buensaborback.business.mapper;

import com.example.buensaborback.domain.dtos.CategoriaDto;
import com.example.buensaborback.domain.entities.Categoria;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoriaMapper extends BaseMapper<Categoria, CategoriaDto> {
}

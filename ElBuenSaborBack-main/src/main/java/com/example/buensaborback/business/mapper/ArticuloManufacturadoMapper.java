package com.example.buensaborback.business.mapper;

import com.example.buensaborback.domain.dtos.ArticuloManufacturadoDto;
import com.example.buensaborback.domain.entities.ArticuloManufacturado;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ArticuloManufacturadoMapper extends BaseMapper<ArticuloManufacturado, ArticuloManufacturadoDto> {
}

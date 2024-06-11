package com.example.buensaborback.business.mapper;

import com.example.buensaborback.domain.dtos.ArticuloInsumoDto;
import com.example.buensaborback.domain.entities.ArticuloInsumo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ArticuloInsumoMapper extends BaseMapper<ArticuloInsumo, ArticuloInsumoDto>{
}

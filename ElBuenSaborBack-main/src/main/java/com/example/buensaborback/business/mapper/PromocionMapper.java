package com.example.buensaborback.business.mapper;

import com.example.buensaborback.domain.dtos.PromocionDto;
import com.example.buensaborback.domain.entities.Promocion;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PromocionMapper extends BaseMapper<Promocion, PromocionDto> {
}

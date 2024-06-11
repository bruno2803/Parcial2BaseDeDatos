package com.example.buensaborback.business.mapper;

import com.example.buensaborback.domain.dtos.FacturaDto;
import com.example.buensaborback.domain.entities.Factura;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FacturaMapper extends BaseMapper<Factura, FacturaDto> {
}

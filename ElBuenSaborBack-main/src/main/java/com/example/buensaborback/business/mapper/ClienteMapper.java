package com.example.buensaborback.business.mapper;

import com.example.buensaborback.domain.dtos.ClienteDto;
import com.example.buensaborback.domain.entities.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper extends BaseMapper<Cliente, ClienteDto> {
}

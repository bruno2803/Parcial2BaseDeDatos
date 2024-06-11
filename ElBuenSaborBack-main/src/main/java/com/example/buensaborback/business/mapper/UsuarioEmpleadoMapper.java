package com.example.buensaborback.business.mapper;

import com.example.buensaborback.domain.dtos.UsuarioEmpleadoDto;
import com.example.buensaborback.domain.entities.UsuarioEmpleado;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioEmpleadoMapper extends BaseMapper<UsuarioEmpleado, UsuarioEmpleadoDto> {
}

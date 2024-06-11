package com.example.buensaborback.business.mapper;

import com.example.buensaborback.domain.dtos.SucursalDto;
import com.example.buensaborback.domain.entities.Sucursal;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {DomicilioMapper.class, EmpresaMapper.class })
public interface SucursalMapper extends BaseMapper<Sucursal, SucursalDto>{

}

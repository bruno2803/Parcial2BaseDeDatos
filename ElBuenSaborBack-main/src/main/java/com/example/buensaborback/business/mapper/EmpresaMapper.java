package com.example.buensaborback.business.mapper;

import com.example.buensaborback.domain.dtos.EmpresaLargeDto;
import com.example.buensaborback.domain.entities.Empresa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmpresaMapper extends BaseMapper<Empresa, EmpresaLargeDto> {

   // EmpresaLargeDto toLargeDto(Empresa empresa);

}

package com.example.buensaborback.business.mapper;
import com.example.buensaborback.domain.dtos.PaisDto;
import com.example.buensaborback.domain.entities.Pais;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaisMapper extends BaseMapper<Pais, PaisDto>{

}

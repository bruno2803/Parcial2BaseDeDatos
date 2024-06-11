package com.example.buensaborback.business.mapper;

import com.example.buensaborback.domain.dtos.PedidoDto;
import com.example.buensaborback.domain.entities.Pedido;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PedidoMapper extends BaseMapper<Pedido, PedidoDto> {
}

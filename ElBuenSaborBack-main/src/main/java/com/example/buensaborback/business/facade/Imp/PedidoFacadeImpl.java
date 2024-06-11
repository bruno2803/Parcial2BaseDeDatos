package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.Base.BaseFacade;
import com.example.buensaborback.business.facade.Base.BaseFacadeImpl;
import com.example.buensaborback.business.facade.PedidoFacade;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.PedidoDto;
import com.example.buensaborback.domain.entities.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PedidoFacadeImpl extends BaseFacadeImpl<Pedido, PedidoDto, Long> implements PedidoFacade {

    @Autowired
    public PedidoFacadeImpl(@Qualifier("pedidoServiceImpl") BaseService<Pedido, Long> baseService, BaseMapper<Pedido, PedidoDto> baseMapper) {
        super(baseService, baseMapper);
    }
}

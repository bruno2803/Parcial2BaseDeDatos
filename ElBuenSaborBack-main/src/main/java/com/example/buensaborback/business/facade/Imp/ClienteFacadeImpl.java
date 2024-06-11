package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.Base.BaseFacadeImpl;
import com.example.buensaborback.business.facade.ClienteFacade;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.ClienteDto;
import com.example.buensaborback.domain.entities.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ClienteFacadeImpl extends BaseFacadeImpl<Cliente, ClienteDto, Long> implements ClienteFacade {
    public ClienteFacadeImpl(@Qualifier("clienteServiceImpl") BaseService<Cliente, Long> baseService, BaseMapper<Cliente, ClienteDto> baseMapper) {
        super(baseService, baseMapper);
    }
}

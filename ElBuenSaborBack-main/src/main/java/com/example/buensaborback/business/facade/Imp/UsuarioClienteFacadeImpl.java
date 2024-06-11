package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.Base.BaseFacadeImpl;
import com.example.buensaborback.business.facade.UsuarioClienteFacade;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.UsuarioClienteDto;
import com.example.buensaborback.domain.entities.UsuarioCliente;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UsuarioClienteFacadeImpl extends BaseFacadeImpl<UsuarioCliente, UsuarioClienteDto, Long> implements UsuarioClienteFacade {
    @Autowired
    public UsuarioClienteFacadeImpl(@Qualifier("usuarioClienteServiceImpl") BaseService<UsuarioCliente, Long> baseService, BaseMapper<UsuarioCliente, UsuarioClienteDto> baseMapper) {
        super(baseService, baseMapper);
    }
}

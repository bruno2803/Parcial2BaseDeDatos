package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.Base.BaseFacadeImpl;
import com.example.buensaborback.business.facade.UsuarioEmpleadoFacade;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.UsuarioEmpleadoDto;
import com.example.buensaborback.domain.entities.UsuarioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UsuarioEmpleadoFacadeImpl extends BaseFacadeImpl<UsuarioEmpleado, UsuarioEmpleadoDto, Long> implements UsuarioEmpleadoFacade {

    @Autowired
    public UsuarioEmpleadoFacadeImpl(@Qualifier("usuarioEmpleadoServiceImpl") BaseService<UsuarioEmpleado, Long> baseService, BaseMapper<UsuarioEmpleado, UsuarioEmpleadoDto> baseMapper) {
        super(baseService, baseMapper);
    }
}

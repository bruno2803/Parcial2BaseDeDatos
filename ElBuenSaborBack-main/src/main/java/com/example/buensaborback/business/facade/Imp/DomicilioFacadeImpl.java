package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.Base.BaseFacadeImpl;
import com.example.buensaborback.business.facade.DomicilioFacade;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.DomicilioDto;
import com.example.buensaborback.domain.entities.Domicilio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class DomicilioFacadeImpl extends BaseFacadeImpl<Domicilio, DomicilioDto, Long> implements DomicilioFacade {
    @Autowired
    public DomicilioFacadeImpl(@Qualifier("domicilioServiceImpl") BaseService<Domicilio, Long> baseService, BaseMapper<Domicilio, DomicilioDto> baseMapper) {
        super(baseService, baseMapper);
    }
}

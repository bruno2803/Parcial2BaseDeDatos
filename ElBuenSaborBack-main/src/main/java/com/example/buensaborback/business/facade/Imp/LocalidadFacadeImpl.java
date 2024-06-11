package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.Base.BaseFacadeImpl;
import com.example.buensaborback.business.facade.LocalidadFacade;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.LocalidadDto;
import com.example.buensaborback.domain.entities.Localidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class LocalidadFacadeImpl extends BaseFacadeImpl<Localidad, LocalidadDto, Long> implements LocalidadFacade {

    @Autowired
    public LocalidadFacadeImpl(@Qualifier("localidadServiceImpl") BaseService<Localidad, Long> baseService, BaseMapper<Localidad, LocalidadDto> mapper) {
        super(baseService, mapper);
    }
}

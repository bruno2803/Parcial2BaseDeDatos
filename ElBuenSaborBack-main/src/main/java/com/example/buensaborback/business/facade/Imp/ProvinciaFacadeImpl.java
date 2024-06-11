package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.Base.BaseFacadeImpl;
import com.example.buensaborback.business.facade.ProvinciaFacade;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.ProvinciaDto;
import com.example.buensaborback.domain.entities.Provincia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaFacadeImpl extends BaseFacadeImpl<Provincia, ProvinciaDto, Long> implements ProvinciaFacade {

    @Autowired
    public ProvinciaFacadeImpl(@Qualifier("provinciaServiceImpl") BaseService<Provincia, Long> baseService, BaseMapper<Provincia, ProvinciaDto> baseMapper) {
        super(baseService, baseMapper);
    }
}

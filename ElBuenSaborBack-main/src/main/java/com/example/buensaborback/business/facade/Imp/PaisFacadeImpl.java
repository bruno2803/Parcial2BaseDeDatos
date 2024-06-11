package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.Base.BaseFacadeImpl;
import com.example.buensaborback.business.facade.PaisFacade;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.PaisDto;
import com.example.buensaborback.domain.entities.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaisFacadeImpl extends BaseFacadeImpl<Pais, PaisDto, Long> implements PaisFacade {
    @Autowired
    public PaisFacadeImpl(@Qualifier("paisServiceImpl") BaseService<Pais, Long> baseService, BaseMapper<Pais, PaisDto> baseMapper) {
        super(baseService, baseMapper);
    }
}

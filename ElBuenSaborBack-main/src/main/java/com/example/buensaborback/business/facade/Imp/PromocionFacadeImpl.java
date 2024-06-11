package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.Base.BaseFacadeImpl;
import com.example.buensaborback.business.facade.PromocionFacade;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.PromocionDto;
import com.example.buensaborback.domain.entities.Promocion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PromocionFacadeImpl extends BaseFacadeImpl<Promocion, PromocionDto, Long> implements PromocionFacade {

    @Autowired
    public PromocionFacadeImpl(@Qualifier("promocionServiceImpl") BaseService<Promocion, Long> baseService, BaseMapper<Promocion, PromocionDto> baseMapper) {
        super(baseService, baseMapper);
    }
}

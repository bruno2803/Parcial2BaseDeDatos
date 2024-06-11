package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.Base.BaseFacadeImpl;
import com.example.buensaborback.business.facade.FacturaFacade;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.FacturaDto;
import com.example.buensaborback.domain.entities.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FacturaFacadeImpl extends BaseFacadeImpl<Factura, FacturaDto, Long> implements FacturaFacade {

    @Autowired
    public FacturaFacadeImpl(@Qualifier("facturaServiceImpl") BaseService<Factura, Long> baseService, BaseMapper<Factura, FacturaDto> baseMapper) {
        super(baseService, baseMapper);
    }
}

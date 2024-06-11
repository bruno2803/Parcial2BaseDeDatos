package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.Base.BaseFacadeImpl;
import com.example.buensaborback.business.facade.UnidadMedidaFacade;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.UnidadMedidaDto;
import com.example.buensaborback.domain.entities.UnidadMedida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UnidadMedidaFacadeImpl extends BaseFacadeImpl<UnidadMedida, UnidadMedidaDto, Long> implements UnidadMedidaFacade {

    @Autowired
    public UnidadMedidaFacadeImpl(@Qualifier("unidadMedidaServiceImpl") BaseService<UnidadMedida, Long> baseService, BaseMapper<UnidadMedida, UnidadMedidaDto> baseMapper) {
        super(baseService, baseMapper);
    }
}

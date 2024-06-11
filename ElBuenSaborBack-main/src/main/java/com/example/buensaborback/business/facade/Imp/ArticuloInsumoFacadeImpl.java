package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.ArticuloInsumoFacade;
import com.example.buensaborback.business.facade.Base.BaseFacadeImpl;
import com.example.buensaborback.business.mapper.ArticuloInsumoMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.ArticuloInsumoDto;
import com.example.buensaborback.domain.entities.ArticuloInsumo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ArticuloInsumoFacadeImpl extends BaseFacadeImpl<ArticuloInsumo, ArticuloInsumoDto, Long> implements ArticuloInsumoFacade {
    public ArticuloInsumoFacadeImpl(@Qualifier("articuloInsumoServiceImpl") BaseService<ArticuloInsumo, Long> baseService, ArticuloInsumoMapper mapper) {
        super(baseService, mapper);
    }
}

package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.ArticuloManufacturadoFacade;
import com.example.buensaborback.business.facade.Base.BaseFacadeImpl;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.ArticuloManufacturadoDto;
import com.example.buensaborback.domain.entities.ArticuloManufacturado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ArticuloManufacturadoFacadeImpl extends BaseFacadeImpl<ArticuloManufacturado, ArticuloManufacturadoDto, Long> implements ArticuloManufacturadoFacade {

    @Autowired
    public ArticuloManufacturadoFacadeImpl(@Qualifier("articuloManufacturadoServiceImpl") BaseService<ArticuloManufacturado, Long> baseService, BaseMapper<ArticuloManufacturado, ArticuloManufacturadoDto> baseMapper) {
        super(baseService, baseMapper);
    }
}

package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.Base.BaseFacadeImpl;
import com.example.buensaborback.business.facade.CategoriaFacade;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.CategoriaDto;
import com.example.buensaborback.domain.entities.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CategoriaFacadeImpl extends BaseFacadeImpl<Categoria, CategoriaDto, Long> implements CategoriaFacade {

    @Autowired
    public CategoriaFacadeImpl(@Qualifier("categoriaServiceImpl") BaseService<Categoria, Long> baseService, BaseMapper<Categoria, CategoriaDto> baseMapper) {
        super(baseService, baseMapper);
    }
}

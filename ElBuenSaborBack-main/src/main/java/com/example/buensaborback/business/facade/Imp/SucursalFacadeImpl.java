package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.Base.BaseFacadeImpl;
import com.example.buensaborback.business.facade.SucursalFacade;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.mapper.SucursalMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.business.service.SucursalService;
import com.example.buensaborback.domain.dtos.SucursalDto;
import com.example.buensaborback.domain.entities.Sucursal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalFacadeImpl extends BaseFacadeImpl<Sucursal, SucursalDto, Long> implements SucursalFacade {

    @Autowired
    public SucursalFacadeImpl(@Qualifier("sucursalServiceImpl") BaseService<Sucursal, Long> baseService, BaseMapper<Sucursal, SucursalDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    protected SucursalMapper sucursalMapper;

    @Autowired
    protected SucursalService sucursalService;

    @Override
    public List<SucursalDto> obtenerSucursalesPorIdEmpresa(Long idEmpresa) {
        return sucursalMapper.toDTOsList(sucursalService.obtenerSucursalesPorIdEmpresa(idEmpresa));
    }
}

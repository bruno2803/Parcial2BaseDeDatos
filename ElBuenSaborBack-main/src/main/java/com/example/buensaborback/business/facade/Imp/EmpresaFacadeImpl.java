package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.Base.BaseFacadeImpl;
import com.example.buensaborback.business.facade.EmpresaFacade;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.mapper.EmpresaMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.business.service.EmpresaService;
import com.example.buensaborback.domain.dtos.EmpresaLargeDto;
import com.example.buensaborback.domain.entities.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmpresaFacadeImpl extends BaseFacadeImpl<Empresa, EmpresaLargeDto, Long> implements EmpresaFacade {

    public EmpresaFacadeImpl(@Qualifier("empresaServiceImpl") BaseService<Empresa, Long> baseService, BaseMapper<Empresa, EmpresaLargeDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    EmpresaMapper empresaMapper;


    @Autowired
    EmpresaService empresaService;
    @Override
    public EmpresaLargeDto addSucursal(Long idEmpresa, Long idSucursal) {
        return empresaMapper.toDTO(empresaService.addSucursal(idEmpresa, idSucursal));
    }
}

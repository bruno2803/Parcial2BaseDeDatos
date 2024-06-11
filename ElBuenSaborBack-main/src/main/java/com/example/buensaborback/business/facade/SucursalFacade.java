package com.example.buensaborback.business.facade;

import com.example.buensaborback.business.facade.Base.BaseFacade;
import com.example.buensaborback.domain.dtos.SucursalDto;

import java.util.List;

public interface SucursalFacade extends BaseFacade<SucursalDto, Long> {
    public List<SucursalDto> obtenerSucursalesPorIdEmpresa(Long idEmpresa);
}

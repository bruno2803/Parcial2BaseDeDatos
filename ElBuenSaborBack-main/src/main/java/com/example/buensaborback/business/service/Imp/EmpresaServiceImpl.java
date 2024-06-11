package com.example.buensaborback.business.service.Imp;

import com.example.buensaborback.business.service.Base.BaseServiceImpl;
import com.example.buensaborback.business.service.EmpresaService;
import com.example.buensaborback.domain.entities.Empresa;
import com.example.buensaborback.repositories.EmpresaRepository;
import org.springframework.stereotype.Service;


@Service("empresaServiceImpl")
public class EmpresaServiceImpl extends BaseServiceImpl<Empresa, Long> implements EmpresaService {

    private EmpresaRepository empresaRepository;
    public EmpresaServiceImpl(EmpresaRepository empresaRepository) {
        super(empresaRepository);
        this.empresaRepository = empresaRepository;
    }

    @Override
    public Empresa addSucursal(Long idEmpresa, Long idSucursal) {
        return null;
    }
}

package com.example.buensaborback.business.service.Imp;

import com.example.buensaborback.business.service.Base.BaseServiceImpl;
import com.example.buensaborback.business.service.SucursalService;
import com.example.buensaborback.domain.entities.Sucursal;
import com.example.buensaborback.repositories.SucursalRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("sucursalServiceImpl")
public class SucursalServiceImpl extends BaseServiceImpl<Sucursal, Long> implements SucursalService {

    private SucursalRepository sucursalRepository;
    public SucursalServiceImpl(SucursalRepository sucursalRepository) {
        super(sucursalRepository);
        this.sucursalRepository = sucursalRepository;
    }

    @Override
    public Sucursal guardarSucursal(Sucursal sucursal) {
        return sucursalRepository.save(sucursal);
    }

    @Override
    public Sucursal actualizarSucursal(Long id, Sucursal sucursal) {
        return sucursalRepository.save(sucursal);
    }

    @Override
    public List<Sucursal> obtenerSucursalesPorIdEmpresa(Long idEmpresa) {
        return sucursalRepository.findAllByEmpresaId(idEmpresa);
    }
}

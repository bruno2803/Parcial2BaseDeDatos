package com.example.buensaborback.business.service.Imp;

import com.example.buensaborback.business.service.Base.BaseServiceImpl;
import com.example.buensaborback.business.service.LocalidadService;
import com.example.buensaborback.domain.entities.Localidad;
import com.example.buensaborback.repositories.LocalidadRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("localidadServiceImpl")
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    private LocalidadRepository localidadRepository;
    public LocalidadServiceImpl(LocalidadRepository localidadRepository) {
        super(localidadRepository);
        this.localidadRepository = localidadRepository;
    }

    @Override
    public List<Localidad> findByProvinciaId(Long provinciaId) {
        return null;
    }
}

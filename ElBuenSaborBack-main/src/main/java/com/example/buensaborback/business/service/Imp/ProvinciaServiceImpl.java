package com.example.buensaborback.business.service.Imp;

import com.example.buensaborback.business.service.Base.BaseServiceImpl;
import com.example.buensaborback.business.service.ProvinciaService;
import com.example.buensaborback.domain.entities.Provincia;
import com.example.buensaborback.repositories.ProvinciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("provinciaServiceImpl")
public class ProvinciaServiceImpl extends BaseServiceImpl<Provincia, Long> implements ProvinciaService {

    private ProvinciaRepository provinciaRepository;
    public ProvinciaServiceImpl(ProvinciaRepository provinciaRepository) {
        super(provinciaRepository);
        this.provinciaRepository = provinciaRepository;
    }

    @Override
    public List<Provincia> findByPaisId(Long idPais) {
        return List.of();
    }
}

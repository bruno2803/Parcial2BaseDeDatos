package com.example.buensaborback.business.service.Imp;

import com.example.buensaborback.business.service.Base.BaseServiceImpl;
import com.example.buensaborback.business.service.PaisService;
import com.example.buensaborback.domain.entities.Pais;
import com.example.buensaborback.repositories.PaisRepository;
import org.springframework.stereotype.Service;


@Service("paisServiceImpl")
public class PaisServiceImpl extends BaseServiceImpl<Pais, Long> implements PaisService {

    private PaisRepository paisRepository;
    public PaisServiceImpl(PaisRepository paisRepository) {
        super(paisRepository);
        this.paisRepository = paisRepository;
    }
}

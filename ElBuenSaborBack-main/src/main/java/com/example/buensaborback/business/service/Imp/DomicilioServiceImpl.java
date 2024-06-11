package com.example.buensaborback.business.service.Imp;

import com.example.buensaborback.business.service.Base.BaseServiceImpl;
import com.example.buensaborback.business.service.DomicilioService;
import com.example.buensaborback.domain.entities.Domicilio;
import com.example.buensaborback.repositories.DomicilioRepository;
import org.springframework.stereotype.Service;


@Service("domicilioServiceImpl")
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio, Long> implements DomicilioService {

    private DomicilioRepository domicilioRepository;
    public DomicilioServiceImpl(DomicilioRepository domicilioRepository) {
        super(domicilioRepository);
        this.domicilioRepository = domicilioRepository;
    }
}

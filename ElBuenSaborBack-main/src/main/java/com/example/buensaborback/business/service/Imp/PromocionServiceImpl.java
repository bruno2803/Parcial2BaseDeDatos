package com.example.buensaborback.business.service.Imp;

import com.example.buensaborback.business.service.Base.BaseServiceImpl;
import com.example.buensaborback.business.service.PromocionService;
import com.example.buensaborback.domain.entities.Promocion;
import com.example.buensaborback.repositories.PromocionRepository;
import org.springframework.stereotype.Service;


@Service("promocionServiceImpl")
public class PromocionServiceImpl extends BaseServiceImpl<Promocion, Long> implements PromocionService {

    private PromocionRepository promocionRepository;
    public PromocionServiceImpl(PromocionRepository promocionRepository) {
        super(promocionRepository);
        this.promocionRepository = promocionRepository;
    }
}

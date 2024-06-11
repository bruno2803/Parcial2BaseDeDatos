package com.example.buensaborback.business.service.Imp;

import com.example.buensaborback.business.service.Base.BaseServiceImpl;
import com.example.buensaborback.business.service.FacturaService;
import com.example.buensaborback.domain.entities.Factura;
import com.example.buensaborback.repositories.FacturaRepository;
import org.springframework.stereotype.Service;


@Service("facturaServiceImpl")
public class FacturaServiceImpl extends BaseServiceImpl<Factura, Long> implements FacturaService {

    private FacturaRepository facturaRepository;
    public FacturaServiceImpl(FacturaRepository facturaRepository) {
        super(facturaRepository);
        this.facturaRepository = facturaRepository;
    }
}

package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.FacturaFacade;
import com.example.buensaborback.domain.dtos.FacturaDto;
import com.example.buensaborback.domain.entities.Factura;
import com.example.buensaborback.business.service.Imp.FacturaServiceImpl;
import com.example.buensaborback.presentation.rest.Base.BaseController;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/facturas")
public class FacturaController extends BaseControllerImpl<FacturaDto, Long, FacturaFacade> implements BaseController<FacturaDto, Long> {

    protected FacturaFacade facturaFacade;

    public FacturaController(FacturaFacade facturaFacade) {
        super(facturaFacade);
        this.facturaFacade = facturaFacade;
    }
}


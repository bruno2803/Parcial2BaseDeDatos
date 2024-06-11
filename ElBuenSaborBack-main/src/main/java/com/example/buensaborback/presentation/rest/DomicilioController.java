package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.DomicilioFacade;
import com.example.buensaborback.domain.dtos.DomicilioDto;
import com.example.buensaborback.domain.entities.Domicilio;
import com.example.buensaborback.business.service.Imp.DomicilioServiceImpl;
import com.example.buensaborback.presentation.rest.Base.BaseController;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/domicilios")
public class DomicilioController extends BaseControllerImpl<DomicilioDto, Long, DomicilioFacade> implements BaseController<DomicilioDto, Long> {

    protected DomicilioFacade domicilioFacade;

    public DomicilioController(DomicilioFacade domicilioFacade) {
        super(domicilioFacade);
        this.domicilioFacade = domicilioFacade;
    }
}


package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.PaisFacade;
import com.example.buensaborback.domain.dtos.PaisDto;
import com.example.buensaborback.presentation.rest.Base.BaseController;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/paises")
public class PaisController extends BaseControllerImpl<PaisDto, Long, PaisFacade> implements BaseController<PaisDto, Long> {

    protected PaisFacade paisFacade;

    public PaisController(PaisFacade paisFacade) {
        super(paisFacade);
        this.paisFacade = paisFacade;
    }
}


package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.LocalidadFacade;
import com.example.buensaborback.domain.dtos.LocalidadDto;
import com.example.buensaborback.presentation.rest.Base.BaseController;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/localidades")
public class LocalidadController extends BaseControllerImpl<LocalidadDto, Long, LocalidadFacade> implements BaseController<LocalidadDto, Long> {

    protected LocalidadFacade localidadFacade;

    public LocalidadController(LocalidadFacade localidadFacade) {
        super(localidadFacade);
        this.localidadFacade = localidadFacade;
    }
}


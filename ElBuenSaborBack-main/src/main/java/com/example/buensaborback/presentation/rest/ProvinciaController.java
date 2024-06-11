package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.ProvinciaFacade;
import com.example.buensaborback.domain.dtos.ProvinciaDto;
import com.example.buensaborback.presentation.rest.Base.BaseController;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/provincias")
public class ProvinciaController extends BaseControllerImpl<ProvinciaDto, Long, ProvinciaFacade> implements BaseController<ProvinciaDto, Long> {

    protected ProvinciaFacade provinciaFacade;

    public ProvinciaController(ProvinciaFacade provinciaFacade) {
        super(provinciaFacade);
        this.provinciaFacade = provinciaFacade;
    }
}


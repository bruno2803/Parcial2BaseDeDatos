package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.UnidadMedidaFacade;
import com.example.buensaborback.domain.dtos.UnidadMedidaDto;
import com.example.buensaborback.domain.entities.UnidadMedida;
import com.example.buensaborback.business.service.Imp.UnidadMedidaServiceImpl;
import com.example.buensaborback.presentation.rest.Base.BaseController;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/unidadesmedida")
public class UnidadMedidaController extends BaseControllerImpl<UnidadMedidaDto, Long, UnidadMedidaFacade> implements BaseController<UnidadMedidaDto, Long> {

    protected UnidadMedidaFacade unidadMedidaFacade;

    public UnidadMedidaController(UnidadMedidaFacade unidadMedidaFacade) {
        super(unidadMedidaFacade);
        this.unidadMedidaFacade = unidadMedidaFacade;
    }
}


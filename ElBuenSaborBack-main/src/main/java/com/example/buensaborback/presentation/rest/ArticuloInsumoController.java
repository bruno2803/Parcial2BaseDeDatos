package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.ArticuloInsumoFacade;
import com.example.buensaborback.domain.dtos.ArticuloInsumoDto;
import com.example.buensaborback.presentation.rest.Base.BaseController;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/insumos")
public class ArticuloInsumoController extends BaseControllerImpl<ArticuloInsumoDto, Long, ArticuloInsumoFacade> implements BaseController<ArticuloInsumoDto, Long> {

    protected ArticuloInsumoFacade articuloInsumoFacade;

    public ArticuloInsumoController(ArticuloInsumoFacade facade) {
        super(facade);
        this.articuloInsumoFacade = facade;
    }
}


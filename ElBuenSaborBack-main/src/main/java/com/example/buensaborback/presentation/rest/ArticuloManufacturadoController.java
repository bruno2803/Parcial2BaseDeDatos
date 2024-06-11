package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.ArticuloManufacturadoFacade;
import com.example.buensaborback.domain.dtos.ArticuloManufacturadoDto;
import com.example.buensaborback.presentation.rest.Base.BaseController;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/manufacturados")
public class ArticuloManufacturadoController extends BaseControllerImpl<ArticuloManufacturadoDto, Long, ArticuloManufacturadoFacade> implements BaseController<ArticuloManufacturadoDto, Long> {

    protected ArticuloManufacturadoFacade articuloManufacturadoFacade;

    public ArticuloManufacturadoController(ArticuloManufacturadoFacade articuloManufacturadoFacade) {
        super(articuloManufacturadoFacade);
        this.articuloManufacturadoFacade = articuloManufacturadoFacade;
    }

}
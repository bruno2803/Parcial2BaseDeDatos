package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.CategoriaFacade;
import com.example.buensaborback.domain.dtos.CategoriaDto;
import com.example.buensaborback.presentation.rest.Base.BaseController;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/categorias")
public class CategoriaController extends BaseControllerImpl<CategoriaDto, Long, CategoriaFacade> implements BaseController<CategoriaDto, Long> {

    protected CategoriaFacade categoriaFacade;

    public CategoriaController(CategoriaFacade categoriaFacade) {
        super(categoriaFacade);
        this.categoriaFacade = categoriaFacade;
    }
}


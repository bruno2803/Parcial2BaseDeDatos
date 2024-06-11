package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.UsuarioClienteFacade;
import com.example.buensaborback.domain.dtos.UsuarioClienteDto;
import com.example.buensaborback.presentation.rest.Base.BaseController;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/usuarios")
public class UsuarioClienteController extends BaseControllerImpl<UsuarioClienteDto, Long, UsuarioClienteFacade> implements BaseController<UsuarioClienteDto, Long> {

    protected UsuarioClienteFacade usuarioClienteFacade;

    public UsuarioClienteController(UsuarioClienteFacade usuarioClienteFacade) {
        super(usuarioClienteFacade);
        this.usuarioClienteFacade = usuarioClienteFacade;
    }
}


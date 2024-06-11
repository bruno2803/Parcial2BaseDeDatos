package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.UsuarioEmpleadoFacade;
import com.example.buensaborback.domain.dtos.UsuarioEmpleadoDto;
import com.example.buensaborback.domain.entities.UsuarioEmpleado;
import com.example.buensaborback.business.service.Imp.UsuarioEmpleadoServiceImpl;
import com.example.buensaborback.presentation.rest.Base.BaseController;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/UsuarioEmpleado")
public class UsuarioEmpleadoController extends BaseControllerImpl<UsuarioEmpleadoDto, Long, UsuarioEmpleadoFacade> implements BaseController<UsuarioEmpleadoDto, Long> {

    protected UsuarioEmpleadoFacade usuarioEmpleadoFacade;

    public UsuarioEmpleadoController(UsuarioEmpleadoFacade usuarioEmpleadoFacade) {
        super(usuarioEmpleadoFacade);
        this.usuarioEmpleadoFacade = usuarioEmpleadoFacade;
    }

}


package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.EmpleadoFacade;
import com.example.buensaborback.domain.dtos.EmpleadoDto;
import com.example.buensaborback.business.service.Imp.EmpleadoServiceImpl;
import com.example.buensaborback.presentation.rest.Base.BaseController;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/empleados")
public class EmpleadoController extends BaseControllerImpl<EmpleadoDto, Long, EmpleadoFacade> implements BaseController<EmpleadoDto, Long> {

    protected EmpleadoFacade empleadoFacade;

    public EmpleadoController(EmpleadoFacade empleadoFacade) {
        super(empleadoFacade);
        this.empleadoFacade = empleadoFacade;
    }

}


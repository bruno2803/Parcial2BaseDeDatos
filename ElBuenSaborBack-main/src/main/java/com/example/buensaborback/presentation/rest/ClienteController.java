package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.ClienteFacade;
import com.example.buensaborback.domain.dtos.ClienteDto;
import com.example.buensaborback.presentation.rest.Base.BaseController;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/clientes")
public class ClienteController extends BaseControllerImpl<ClienteDto, Long, ClienteFacade> implements BaseController<ClienteDto, Long> {

    protected ClienteFacade clienteFacade;

    public ClienteController(ClienteFacade clienteFacade) {
        super(clienteFacade);
        this.clienteFacade = clienteFacade;
    }
}


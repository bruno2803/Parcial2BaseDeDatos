package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.PedidoFacade;
import com.example.buensaborback.domain.dtos.PedidoDto;
import com.example.buensaborback.presentation.rest.Base.BaseController;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/pedidos")
public class PedidoController extends BaseControllerImpl<PedidoDto, Long, PedidoFacade> implements BaseController<PedidoDto, Long> {

    protected PedidoFacade pedidoFacade;

    public PedidoController(PedidoFacade pedidoFacade) {
        super(pedidoFacade);
        this.pedidoFacade = pedidoFacade;
    }
}


package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.PromocionFacade;
import com.example.buensaborback.domain.dtos.PromocionDto;
import com.example.buensaborback.presentation.rest.Base.BaseController;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/promociones")
public class PromocionController extends BaseControllerImpl<PromocionDto, Long, PromocionFacade> implements BaseController<PromocionDto, Long> {

    protected PromocionFacade promocionFacade;

    public PromocionController(PromocionFacade promocionFacade) {
        super(promocionFacade);
        this.promocionFacade = promocionFacade;
    }
}


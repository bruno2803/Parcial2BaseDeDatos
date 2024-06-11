package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.EmpresaFacade;
import com.example.buensaborback.domain.dtos.EmpresaLargeDto;
import com.example.buensaborback.presentation.rest.Base.BaseController;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/empresas")
public class EmpresaController extends BaseControllerImpl<EmpresaLargeDto, Long, EmpresaFacade> implements BaseController<EmpresaLargeDto, Long> {

    protected EmpresaFacade empresaFacade;

    public EmpresaController(EmpresaFacade empresaFacade) {
        super(empresaFacade);
        this.empresaFacade = empresaFacade;
    }


    @PutMapping("/addSucursal/{idEmpresa}/{idSucursal}")
    public ResponseEntity<EmpresaLargeDto> addSucursal(@PathVariable Long idEmpresa, @PathVariable Long idSucursal){
        return ResponseEntity.ok(facade.addSucursal(idEmpresa,idSucursal));
    }
}


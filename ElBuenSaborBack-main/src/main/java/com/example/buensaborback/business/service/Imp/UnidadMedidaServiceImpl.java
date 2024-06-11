package com.example.buensaborback.business.service.Imp;

import com.example.buensaborback.business.service.Base.BaseServiceImpl;
import com.example.buensaborback.business.service.UnidadMedidaService;
import com.example.buensaborback.domain.entities.UnidadMedida;
import com.example.buensaborback.repositories.UnidadMedidaRepository;
import org.springframework.stereotype.Service;


@Service("unidadMedidaServiceImpl")
public class UnidadMedidaServiceImpl extends BaseServiceImpl<UnidadMedida, Long> implements UnidadMedidaService {

    private UnidadMedidaRepository unidadMedidaRepository;
    public UnidadMedidaServiceImpl(UnidadMedidaRepository unidadMedidaRepository) {
        super(unidadMedidaRepository);
        this.unidadMedidaRepository = unidadMedidaRepository;
    }
}

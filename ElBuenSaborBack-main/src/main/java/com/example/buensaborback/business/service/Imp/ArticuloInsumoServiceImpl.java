package com.example.buensaborback.business.service.Imp;

import com.example.buensaborback.business.service.ArticuloInsumoService;
import com.example.buensaborback.business.service.Base.BaseServiceImpl;
import com.example.buensaborback.domain.entities.ArticuloInsumo;
import com.example.buensaborback.repositories.ArticuloInsumoRepository;
import org.springframework.stereotype.Service;


@Service("articuloInsumoServiceImpl")
public class ArticuloInsumoServiceImpl extends BaseServiceImpl<ArticuloInsumo, Long> implements ArticuloInsumoService {

    private ArticuloInsumoRepository articuloInsumoRepository;
    public ArticuloInsumoServiceImpl(ArticuloInsumoRepository articuloInsumoRepository) {
        super(articuloInsumoRepository);
        this.articuloInsumoRepository = articuloInsumoRepository;
    }
}

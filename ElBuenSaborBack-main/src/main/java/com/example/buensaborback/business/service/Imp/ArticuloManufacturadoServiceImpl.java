package com.example.buensaborback.business.service.Imp;

import com.example.buensaborback.business.service.ArticuloManufacturadoService;
import com.example.buensaborback.business.service.Base.BaseServiceImpl;
import com.example.buensaborback.domain.entities.ArticuloManufacturado;
import com.example.buensaborback.repositories.ArticuloManufacturadoRepository;
import org.springframework.stereotype.Service;


@Service("articuloManufacturadoServiceImpl")
public class ArticuloManufacturadoServiceImpl extends BaseServiceImpl<ArticuloManufacturado, Long> implements ArticuloManufacturadoService {

    private ArticuloManufacturadoRepository articuloManufacturadoRepository;
    public ArticuloManufacturadoServiceImpl(ArticuloManufacturadoRepository articuloManufacturadoRepository) {
        super(articuloManufacturadoRepository);
        this.articuloManufacturadoRepository = articuloManufacturadoRepository;
    }
}

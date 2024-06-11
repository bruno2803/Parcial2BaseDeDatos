package com.example.buensaborback.business.service.Imp;

import com.example.buensaborback.business.service.Base.BaseServiceImpl;
import com.example.buensaborback.business.service.CategoriaService;
import com.example.buensaborback.domain.entities.Categoria;
import com.example.buensaborback.repositories.CategoriaRepository;
import org.springframework.stereotype.Service;


@Service("categoriaServiceImpl")
public class CategoriaServiceImpl extends BaseServiceImpl<Categoria, Long> implements CategoriaService {

    private CategoriaRepository categoriaRepository;
    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
        super(categoriaRepository);
        this.categoriaRepository = categoriaRepository;
    }
}

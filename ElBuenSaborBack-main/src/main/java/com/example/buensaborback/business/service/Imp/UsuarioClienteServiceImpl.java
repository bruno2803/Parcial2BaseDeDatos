package com.example.buensaborback.business.service.Imp;

import com.example.buensaborback.business.service.Base.BaseServiceImpl;
import com.example.buensaborback.business.service.UsuarioClienteService;
import com.example.buensaborback.domain.entities.UsuarioCliente;
import com.example.buensaborback.repositories.UsuarioClienteRepository;
import org.springframework.stereotype.Service;


@Service("usuarioClienteServiceImpl")
public class UsuarioClienteServiceImpl extends BaseServiceImpl<UsuarioCliente, Long> implements UsuarioClienteService {

    private UsuarioClienteRepository usuarioClienteRepository;
    public UsuarioClienteServiceImpl(UsuarioClienteRepository usuarioClienteRepository) {
        super(usuarioClienteRepository);
        this.usuarioClienteRepository = usuarioClienteRepository;
    }
}

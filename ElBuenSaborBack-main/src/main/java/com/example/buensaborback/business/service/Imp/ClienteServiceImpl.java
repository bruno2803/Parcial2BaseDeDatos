package com.example.buensaborback.business.service.Imp;

import com.example.buensaborback.business.service.Base.BaseServiceImpl;
import com.example.buensaborback.business.service.ClienteService;
import com.example.buensaborback.domain.entities.Cliente;
import com.example.buensaborback.repositories.ClienteRepository;
import org.springframework.stereotype.Service;


@Service("clienteServiceImpl")
public class ClienteServiceImpl extends BaseServiceImpl<Cliente, Long> implements ClienteService {

    private ClienteRepository clienteRepository;
    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        super(clienteRepository);
        this.clienteRepository = clienteRepository;
    }
}

package com.example.buensaborback.business.service.Imp;

import com.example.buensaborback.business.service.Base.BaseServiceImpl;
import com.example.buensaborback.business.service.PedidoService;
import com.example.buensaborback.domain.entities.Pedido;
import com.example.buensaborback.repositories.PedidoRepository;
import org.springframework.stereotype.Service;


@Service("pedidoServiceImpl")
public class PedidoServiceImpl extends BaseServiceImpl<Pedido, Long> implements PedidoService {

    private PedidoRepository pedidoRepository;
    public PedidoServiceImpl(PedidoRepository pedidoRepository) {
        super(pedidoRepository);
        this.pedidoRepository = pedidoRepository;
    }
}

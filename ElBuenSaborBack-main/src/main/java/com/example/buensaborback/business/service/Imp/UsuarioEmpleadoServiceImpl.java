package com.example.buensaborback.business.service.Imp;

import com.example.buensaborback.business.service.Base.BaseServiceImpl;
import com.example.buensaborback.business.service.UsuarioEmpleadoService;
import com.example.buensaborback.domain.entities.UsuarioEmpleado;
import com.example.buensaborback.repositories.UsuarioEmpleadoRepository;
import org.springframework.stereotype.Service;


@Service("usuarioEmpleadoServiceImpl")
public class UsuarioEmpleadoServiceImpl extends BaseServiceImpl<UsuarioEmpleado, Long> implements UsuarioEmpleadoService {

    private UsuarioEmpleadoRepository usuarioEmpleadoRepository;
    public UsuarioEmpleadoServiceImpl(UsuarioEmpleadoRepository usuarioEmpleadoRepository) {
        super(usuarioEmpleadoRepository);
        this.usuarioEmpleadoRepository = usuarioEmpleadoRepository;
    }
}

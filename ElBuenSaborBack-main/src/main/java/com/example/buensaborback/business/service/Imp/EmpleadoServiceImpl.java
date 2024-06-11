package com.example.buensaborback.business.service.Imp;

import com.example.buensaborback.business.service.Base.BaseServiceImpl;
import com.example.buensaborback.business.service.EmpleadoService;
import com.example.buensaborback.domain.entities.Empleado;
import com.example.buensaborback.repositories.EmpleadoRepository;
import org.springframework.stereotype.Service;


@Service("empleadoServiceImpl")
public class EmpleadoServiceImpl extends BaseServiceImpl<Empleado, Long> implements EmpleadoService {

    private EmpleadoRepository empleadoRepository;
    public EmpleadoServiceImpl(EmpleadoRepository empleadoRepository) {
        super(empleadoRepository);
        this.empleadoRepository = empleadoRepository;
    }
}

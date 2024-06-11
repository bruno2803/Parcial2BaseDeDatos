package com.example.buensaborback;

import com.example.buensaborback.business.mapper.EmpresaMapper;
import com.example.buensaborback.domain.dtos.EmpresaDto;
import com.example.buensaborback.domain.dtos.EmpresaLargeDto;
import com.example.buensaborback.domain.entities.Empresa;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmpresaMapperTest {

    @Autowired
    private EmpresaMapper empresaMapper;

    @Test
    public void testToDto() {
        Empresa entity = new Empresa();
        entity.setNombre("Test");
        EmpresaLargeDto dto = empresaMapper.toDTO(entity);
            assertEquals("Test", dto.getNombre());
    }

}

package com.example.buensaborback.business.facade.Base;

import com.example.buensaborback.domain.dtos.BaseDto;

import java.io.Serializable;
import java.util.List;

public interface BaseFacade <D extends BaseDto, ID extends Serializable>{
    public D create (D request) throws Exception;
    public List<D> getAll() throws Exception;
    public D getById(ID id) throws Exception;
    public D update (D request, ID id) throws Exception;
    public void delete (ID id) throws Exception;
}

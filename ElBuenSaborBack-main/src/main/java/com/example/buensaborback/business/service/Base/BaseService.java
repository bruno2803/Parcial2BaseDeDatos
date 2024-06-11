package com.example.buensaborback.business.service.Base;

import com.example.buensaborback.domain.entities.Base;

import java.io.Serializable;
import java.util.List;


public interface BaseService<T extends Base, ID extends Serializable> {
    List<T> getAll() throws Exception;
    T getById(ID id) throws Exception;
    T save(T entity) throws Exception;
    T update(T entity) throws Exception;
    boolean delete(ID id) throws Exception;
}

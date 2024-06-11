package com.example.buensaborback.presentation.rest.Base;

import com.example.buensaborback.domain.dtos.BaseDto;
import com.example.buensaborback.domain.entities.Base;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;
import java.util.List;

public interface BaseController<D extends BaseDto,ID extends Serializable> {

    public ResponseEntity<List<D>> getAll() throws Exception;
    public ResponseEntity<D> getById(@PathVariable ID id) throws Exception;
    public ResponseEntity<D> create(@RequestBody D d) throws Exception;
    public ResponseEntity<D> update(@PathVariable ID id,@RequestBody D d) throws Exception;
    public ResponseEntity<?> delete(@PathVariable ID id) throws Exception;

}

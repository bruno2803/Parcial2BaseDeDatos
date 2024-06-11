package com.example.buensaborback.presentation.rest.Base;

import com.example.buensaborback.business.facade.Base.BaseFacade;
import com.example.buensaborback.domain.dtos.BaseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

public abstract class BaseControllerImpl<D extends BaseDto, ID extends Serializable, F extends BaseFacade<D, ID>> implements BaseController<D, ID> {

    private static final Logger logger = LoggerFactory.getLogger(BaseControllerImpl.class);
    protected F facade;
    public BaseControllerImpl(F facade){
        this.facade = facade;
    }

    @GetMapping
    public ResponseEntity<List<D>> getAll() throws Exception {
        logger.info("INICIO GET ALL");
        return ResponseEntity.ok(facade.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<D> getById(@PathVariable ID id) throws Exception {
        logger.info("INICIO GET BY ID {}", id);
        return ResponseEntity.ok(facade.getById(id));
    }

    @PostMapping()
    public ResponseEntity<D> create(@RequestBody D entity) throws Exception {
        logger.info("INICIO CREATE {}", entity.getClass());
        return ResponseEntity.ok(facade.create(entity));
    }

    @Override
    public ResponseEntity<D> update(ID id, D d) throws Exception {
        logger.info("INICIO EDIT {}", d.getClass());
        return ResponseEntity.ok(facade.update(d, id));
    }

    @Override
    public ResponseEntity<?> delete(ID id) throws Exception {
        logger.info("INICIO DELETE {}", id);
        facade.delete(id);
        return ResponseEntity.ok(null);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<D> update(@RequestBody D entity, @PathVariable ID id) throws Exception {
//        logger.info("INICIO EDIT {}", entity.getClass());
//        return ResponseEntity.ok(facade.update(entity, id));
//    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> deleteById(@PathVariable ID id) throws Exception {
//        logger.info("INICIO DELETE BY ID");
//        facade.delete(id);
//        return ResponseEntity.ok(null);
//    }
}


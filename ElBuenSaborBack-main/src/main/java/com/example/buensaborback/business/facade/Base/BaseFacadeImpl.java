package com.example.buensaborback.business.facade.Base;

import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.BaseDto;
import com.example.buensaborback.domain.entities.Base;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public class BaseFacadeImpl<T extends Base, D extends BaseDto, ID extends Serializable> implements BaseFacade<D, ID>{

    protected BaseService<T, ID> baseService;
    protected BaseMapper<T, D> baseMapper;

    public BaseFacadeImpl(BaseService<T,ID> baseService, BaseMapper<T,D> baseMapper) {
        this.baseService = baseService;
        this.baseMapper = baseMapper;
    }

    @Override
    public D create(D request) throws Exception {
        var entityToCreate = baseMapper.toEntity(request);
        var entityCreated = baseService.save(entityToCreate);
        return baseMapper.toDTO(entityCreated);
    }

    @Override
    public List<D> getAll() throws Exception {
        var entities = baseService.getAll();
        return entities
                .stream()
                .map(baseMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public D getById(ID id) throws Exception {
        var entityToFind = baseService.getById(id);
        return baseMapper.toDTO(entityToFind);
    }

    @Override
    public D update(D request, ID id) throws Exception {
        var entityToUpdate = baseMapper.toEntity(request);
        var entityUpdated = baseService.update(entityToUpdate);
        return baseMapper.toDTO(entityUpdated);
    }

    @Override
    public void delete(ID id) throws Exception {
        baseService.delete(id);
    }
}

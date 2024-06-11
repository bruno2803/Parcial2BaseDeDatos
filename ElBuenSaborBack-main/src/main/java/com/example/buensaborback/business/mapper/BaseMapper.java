package com.example.buensaborback.business.mapper;

import com.example.buensaborback.domain.dtos.BaseDto;
import com.example.buensaborback.domain.entities.Base;

import java.util.List;

public interface BaseMapper<T extends Base, D extends BaseDto>{
    public D toDTO(T source);
    public T toEntity(D source);
    public List<D> toDTOsList(List<T> source);
}

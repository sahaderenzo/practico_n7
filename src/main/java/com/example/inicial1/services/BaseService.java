package com.example.inicial1.services;

import com.example.inicial1.entities.Base;

import java.io.Serializable;
import java.rmi.server.ExportException;
import java.util.List;

public interface BaseService<E extends Base, ID extends Serializable> {
    public List<E> findAll() throws Exception;
    public E findById(ID id) throws Exception;
    public E save(E entity) throws Exception;
    public E update (ID id, E entity) throws Exception;
    public boolean delete(ID id) throws Exception;
}

package com.formacionbdi.springboot.app.productos.models.service;

import com.formacionbdi.springboot.app.productos.models.entity.Producto;
import org.apache.catalina.LifecycleState;

import java.util.List;

public interface IProductosService {

    public List<Producto> findAll();
    public Producto findById(Long id);
}

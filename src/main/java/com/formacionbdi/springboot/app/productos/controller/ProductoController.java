package com.formacionbdi.springboot.app.productos.controller;

import com.formacionbdi.springboot.app.productos.models.entity.Producto;
import com.formacionbdi.springboot.app.productos.models.service.IProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private IProductosService productosService;

    @GetMapping("/productos")
    public List<Producto> listar(){
        return productosService.findAll();
    }

    @GetMapping("/detalle/{id}")
    public Producto detalle(@PathVariable Long id){
        return productosService.findById(id);
    }
}

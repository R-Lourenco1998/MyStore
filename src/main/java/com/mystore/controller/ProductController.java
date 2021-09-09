package com.mystore.controller;

import com.mystore.domain.Product;
import com.mystore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping
    public List<Product> findAll() {
        return service.findAll();
    }

    @GetMapping(path = "/{id}")
    public Product findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping
    public Product create(@RequestBody Product product){
        return service.create(product);
    }

    @DeleteMapping(path = "/{id}")
    public String delete(@PathVariable Long id){
        return service.delete(id);
    }

    @PutMapping
    public Product update(@RequestBody Product product){
        return service.update(product);
    }


    }


package com.mystore.service;

import com.mystore.domain.Product;
import com.mystore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.Valid;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public Product create(Product product){
        return repository.save(product);
    }

    public Product findById(Long id){
        return repository.findById(id).get();
    }

    public List<Product> findAll(){
        return (List<Product>) repository.findAll();
    }

    public String delete(Long id){
        Product product = repository.findById(id).get();
        repository.delete(product);
        return "Produto deletado!";
    }

    public Product update(@Valid Product product){
        repository.save(product);
        return product;
    }


    }



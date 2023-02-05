package com.example.workshop.services;

import com.example.workshop.entities.Product;
import com.example.workshop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }


    public Product findByID(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }


}

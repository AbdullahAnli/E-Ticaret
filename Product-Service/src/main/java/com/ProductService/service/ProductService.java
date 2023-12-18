package com.ProductService.service;

import com.ProductService.entity.Product;
import com.ProductService.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product>getAllProducts(){
        return productRepository.findAll();
    }



    }




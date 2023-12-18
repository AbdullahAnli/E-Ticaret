package com.ProductService.controller;

import com.ProductService.entity.Product;
import com.ProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();

    }

    @GetMapping("/{productId}")
    public Product getProdctById(@PathVariable Long productId){
        return productService.getProductById(productId);
    }
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }


    @PutMapping("/{productId}")
    protected Product updateProduct(@PathVariable Long productId ,
                                    @RequestBody Product updatedProduct){
        return productService.updateProduct(productId,updatedProduct);

    }
    @DeleteMapping("/{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long productId){
        productService.deleteProduct(productId);
        return ResponseEntity.ok().build();

    }


}

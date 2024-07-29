package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    ProductRepository repository;

    @GetMapping("/products")
    public List<Product> getProducts(){
       return (List<Product>) repository.findAll();
    }

    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product){
        return repository.save(product);
    }

    @DeleteMapping("/products/delete/{productId}")
    public String deleteProduct(@PathVariable int productId){
        repository.deleteById(productId);
        return "OK";
    }

}
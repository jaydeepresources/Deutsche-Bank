package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

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

    // using projection interface
    @GetMapping("/projection/products/manufacturers/{manufacturerId}")
    public List<ProductManufacturerProjection> getProductsByManufacturerIdUsingProjection(@PathVariable Integer manufacturerId){
        return repository.findByJoiningManufacturerIdUsingProjection((manufacturerId));
    }

    // using manual intervention and DTO
    @GetMapping("/products/manufacturers/{manufacturerId}")
    public ProductManufacturer getProductsByManufacturerId(@PathVariable Integer manufacturerId){
        Object [][] values = repository.findByJoiningManufacturerId(manufacturerId);
        ProductManufacturer pm = null;
        for (int i = 0; i < values.length; i++) {
            Integer pid = Integer.parseInt((values[i][0]).toString());
            String pname = (values[i][1]).toString();
            Float pprice = Float.parseFloat((values[i][2]).toString());
            Integer mid = Integer.parseInt((values[i][3]).toString());
            String mname = (values[i][4]).toString();
            String mcountry = (values[i][5]).toString();
            pm = new ProductManufacturer(pid,pname, pprice, mid, mname, mcountry);
        }

        return pm;
    }

}
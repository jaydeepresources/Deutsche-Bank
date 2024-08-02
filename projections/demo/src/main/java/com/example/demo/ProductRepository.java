package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    @Query(value = "select product_id, product_name, product_price, p.manufacturer_id, manufacturer_name, manufacturer_country from products p, manufacturers m where p.manufacturer_id = m.manufacturer_id AND p.manufacturer_id = ?1", nativeQuery = true)
    Object[][] findByJoiningManufacturerId(Integer manufacturerId);

    @Query(value = "select product_id as productId, product_name as productName, product_price as productPrice, p.manufacturer_id as manufacturerId, manufacturer_name as manufacturerName, manufacturer_country as manufacturerCountry from products p, manufacturers m where p.manufacturer_id = m.manufacturer_id AND p.manufacturer_id = ?1", nativeQuery = true)
    List<ProductManufacturerProjection> findByJoiningManufacturerIdUsingProjection(Integer manufacturerId);
}
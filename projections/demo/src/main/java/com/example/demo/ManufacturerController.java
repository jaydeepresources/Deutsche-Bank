package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ManufacturerController {

    @Autowired
    ManufacturerRepository repository;

    @GetMapping("/manufacturers")
    public List<Manufacturer> getManufacturers() {
        return (List<Manufacturer>) repository.findAll();
    }

    @PostMapping("/manufacturers")
    public Manufacturer saveManufacturer(@RequestBody Manufacturer manufacturer) {
        return repository.save(manufacturer);
    }

    @DeleteMapping("/manufacturers/delete/{manufacturerId}")
    public String deleteManufacturer(@PathVariable int manufacturerId) {
        repository.deleteById(manufacturerId);
        return "OK";
    }
}

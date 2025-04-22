package com.piyush.myShop.controller;

import com.piyush.myShop.model.Product;
import com.piyush.myShop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductsController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){

        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductbyId(@PathVariable int prodId){
        return service.getProducts(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        System.out.println(prod);
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);

    }
}

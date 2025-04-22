package com.piyush.myShop.service;

import com.piyush.myShop.model.Product;
import com.piyush.myShop.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(123, "OnePlus", 30000),
//            new Product(234, "MacBook", 63000),
//            new Product(345, "Yamaha", 128000)));

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProducts(int prodId) {
//        return products.stream()
//                .filter(p -> p.getProdId() == prodId)
//                .findFirst().orElse(new Product(000, "Empty", 0));
        return repo.findById(prodId).orElse(new Product());
    }

    @PutMapping("/products")
    public void addProduct(Product prod) {
//        products.add(prod);
        repo.save(prod);

    }


    public void updateProduct(Product prod) {
//        int index=0;
//
//        for (int i=0;i<products.size();i++)
//        {
//            if(products.get(i).getProdId() == prod.getProdId())
//                index = i;
//        }
//        products.set(index,prod);

        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}



package com.sopen.food_sopen.controller;

import com.sopen.food_sopen.entity.Product;
import com.sopen.food_sopen.repository.ProductRepository;
import com.sopen.food_sopen.service.ProductService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/food_sopen")
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {

    @Autowired
    private ProductRepository pr;

//    @Autowired
//    private ProductService ps;

    @GetMapping("/products")
    public ResponseEntity<?> getProducts(){
        JSONObject response = new JSONObject();
        List<Product> products = pr.getProducts();
        response.put("products", products);
        return ResponseEntity.ok().body(products);
    }
}

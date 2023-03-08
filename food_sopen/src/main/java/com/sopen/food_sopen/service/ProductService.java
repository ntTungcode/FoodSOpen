package com.sopen.food_sopen.service;

import com.sopen.food_sopen.dto.request.ProductRequest;
import com.sopen.food_sopen.entity.Product;
import com.sopen.food_sopen.repository.ProductRepository;

import java.util.List;

public interface ProductService {
    Product findProductById(Long id);

    List<Product> getProductsByCategoryId(Long id);
    Product addNewProduct(ProductRequest productRequest);

    String updateProduct(Long id, ProductRequest productRequest);

    String deleteProduct(Long id);

    List<Product> searchProduct(String searchText);
}

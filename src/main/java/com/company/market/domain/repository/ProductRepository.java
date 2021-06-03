package com.company.market.domain.repository;

import com.company.market.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAll();
    Optional<Product> getProduct(Long categoryId);
    Optional<List<Product>> getByCategory(Long categoryId);
    Optional<List<Product>> getScarsProducts(int quantity);
    Product save(Product product);
    void delete(Long productId);

}

package com.company.market.domain.service;

import com.company.market.domain.Product;
import com.company.market.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public Optional<List<Product>> getByCategory(Long categoryId) {
        return productRepository.getByCategory(categoryId);
    }

    public Optional<Product> getProduct(Long productId) {
        return productRepository.getProduct(productId);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public boolean delete(Long productId) {
        return getProduct(productId).map(product -> {
            productRepository.delete(productId);
            return true;
        }).orElse( false);
    }
}

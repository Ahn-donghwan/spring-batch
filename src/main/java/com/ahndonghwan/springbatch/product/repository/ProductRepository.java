package com.ahndonghwan.springbatch.product.repository;

import com.ahndonghwan.springbatch.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

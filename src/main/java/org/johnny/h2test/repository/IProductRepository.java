package org.johnny.h2test.repository;

import org.johnny.h2test.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
}

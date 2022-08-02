package com.ashutosh.SpringBootCRUD.Repository;

import com.ashutosh.SpringBootCRUD.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
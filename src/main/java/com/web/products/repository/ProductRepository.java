package com.web.products.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.products.dao.Products;

@Repository
public interface ProductRepository extends CrudRepository<Products, Integer>{

}

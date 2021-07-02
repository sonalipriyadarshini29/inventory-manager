package com.project.InventoryManager.inventory;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository <Product, Integer> {
    public Long countById(Integer id);
}

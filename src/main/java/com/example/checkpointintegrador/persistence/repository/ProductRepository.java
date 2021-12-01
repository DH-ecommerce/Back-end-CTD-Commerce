package com.example.checkpointintegrador.persistence.repository;


import com.example.checkpointintegrador.persistence.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

    @Query("SELECT p FROM ProductEntity p WHERE p.category.name = ?1")
    List<ProductEntity> findProductByCategory(String category);
}

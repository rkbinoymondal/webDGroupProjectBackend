package com.example.webDviva.repository;

import com.example.webDviva.Model.Food;
import com.example.webDviva.Model.Recipe;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    List<Recipe> findAllByOwner(String owner);

    @Transactional
    void deleteAllByOwner(String owner);
}
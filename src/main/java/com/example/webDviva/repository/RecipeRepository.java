package com.example.webDviva.repository;

import com.example.webDviva.Model.Food;
import com.example.webDviva.Model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
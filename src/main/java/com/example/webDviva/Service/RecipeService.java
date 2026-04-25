package com.example.webDviva.Service;

import com.example.webDviva.Model.Food;
import com.example.webDviva.Model.Recipe;
import com.example.webDviva.repository.FoodRepository;
import com.example.webDviva.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    @Autowired
    RecipeRepository repo;

    public List<Recipe> getRecipes(){
        return repo.findAll();
    }

    public Recipe saveRecipe(Recipe recipe) {
        return repo.save(recipe);
    }

    public Recipe updateRecipe(Recipe recipe) {
        return repo.save(recipe);
    }

    public void deleteRecipe(Long recipeId){
        repo.deleteById(recipeId);
    }

    public Recipe getARecipe(Long recipeId){
        return repo.findById(recipeId).orElse(null);
    }

    public void deleteRecipeAll(){
        repo.deleteAll();
    }

    public List<Recipe> getAllByOwner(String owner){
        return repo.findAllByOwner(owner);
    }

    public void deleteAllByOwner(String owner){ repo.deleteAllByOwner(owner);    }
}

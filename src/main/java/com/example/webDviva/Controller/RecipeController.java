package com.example.webDviva.Controller;

import com.example.webDviva.Model.Recipe;
import com.example.webDviva.Service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class RecipeController {
    @Autowired
    RecipeService service;

    @GetMapping("/recipes")
    public List<Recipe> getAllRecipes(){
        return service.getRecipes();
    }

    @PostMapping("/recipes")
    public Recipe addRecipe(@RequestBody Recipe recipe) {
        return service.saveRecipe(recipe);
    }

    @PutMapping("/recipes")
    public Recipe updateRecipe(@RequestBody Recipe recipe) {
        return service.updateRecipe(recipe);
    }

    @GetMapping("/recipes/{recipeId}")
    public Recipe getARecipe(@PathVariable Long recipeId){
        return service.getARecipe(recipeId);
    }

    @DeleteMapping("/recipes/{recipeId}")
    public void deleteARecipe(@PathVariable Long recipeId){
        service.deleteRecipe(recipeId);
    }

    @DeleteMapping("/recipes")
    public void deleteAllRecipes(){
        service.deleteRecipeAll();
    }

    @GetMapping("/recipes/{owner}")
    public List<Recipe> getAllByOwner(@PathVariable String owner){
        return service.getByOwner(owner);
    }

    @DeleteMapping("/recipes/{owner}")
    public void deleteAllByOwner(@PathVariable String owner){
        service.deleteByOwner(owner);
    }
}

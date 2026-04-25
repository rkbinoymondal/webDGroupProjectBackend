package com.example.webDviva.Controller;

import com.example.webDviva.Model.Favorite;
import com.example.webDviva.Model.Food;
import com.example.webDviva.Model.Recipe;
import com.example.webDviva.Service.FavoriteService;
import com.example.webDviva.Service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class FavoriteController {
    @Autowired
    FavoriteService service;

    @GetMapping("/favorites")
    public List<Favorite> getAllFavorites(){
        return service.getFavorites();
    }

    @PostMapping("/favorites")
    public Favorite addFavorite(@RequestBody Favorite food) {
        return service.saveFavorite(food);
    }

    @PutMapping("/favorites")
    public Favorite updateFavorite(@RequestBody Favorite food) {
        return service.updateFavorite(food);
    }

    @GetMapping("/favorites/{foodId}")
    public Favorite getAFavorite(@PathVariable Long foodId){
        return service.getAFavorite(foodId);
    }

    @DeleteMapping("/favorites/{foodId}")
    public void deleteAFavorite(@PathVariable Long foodId){
        service.deleteFavorite(foodId);
    }

    @DeleteMapping("/favorites")
    public void deleteAllFavorites(){
        service.deleteFavoriteAll();
    }

    @GetMapping("/favorites/owner/{owner}")
    public List<Favorite> getAllByOwner(@PathVariable String owner){
        return service.getByOwner(owner);
    }

    @DeleteMapping("/favorites/owner/{owner}")
    public void deleteAllByOwner(@PathVariable String owner){
        service.deleteByOwner(owner);
    }

    @DeleteMapping("/favorites/owner/{owner}/foodId/{foodId}")
    public void deleteByOwnerAndFoodId(@PathVariable String owner, @PathVariable String foodId){
        service.deleteByOwnerAndFoodId(owner,foodId);
    }
}

package com.example.webDviva.Controller;

import com.example.webDviva.Model.Food;
import com.example.webDviva.Service.FoodServiceBig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class FoodControllerBig {
    @Autowired
    FoodServiceBig service;

    @GetMapping("/foodsBig")
    public List<Food> getAllFoodsBig(){
        return service.getFoodsBig();
    }

    @PostMapping("/foodsBig")
    public Food addFoodBig(@RequestBody Food foodBig) {
        return service.saveFoodBig(foodBig);
    }

    @PutMapping("/foodsBig")
    public Food updateFoodBig(@RequestBody Food foodBig) {
        return service.updateFoodBig(foodBig);
    }

    @GetMapping("/foodsBig/{foodIdBig}")
    public Food getAFoodBig(@PathVariable String foodIdBig){
        return service.getAFoodBig(foodIdBig);
    }

    @DeleteMapping("/foodsBig/{foodIdBig}")
    public void deleteAFoodBig(@PathVariable String foodIdBig){
        service.deleteFoodBig(foodIdBig);
    }

    @DeleteMapping("/foodsBig")
    public void deleteAllFoodsBig(){
        service.deleteFoodAllBig();
    }
}

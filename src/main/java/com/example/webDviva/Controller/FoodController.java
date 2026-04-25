package com.example.webDviva.Controller;

import com.example.webDviva.Model.Food;
import com.example.webDviva.Service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class FoodController {
    @Autowired
    FoodService service;

    @GetMapping("/foods")
    public List<Food> getAllFoods(){
        return service.getFoods();
    }

    @PostMapping("/foods")
    public Food addFood(@RequestBody Food food) {
        return service.saveFood(food);
    }

    @PutMapping("/foods")
    public Food updateFood(@RequestBody Food food) {
        return service.updateFood(food);
    }

    @GetMapping("/foods/{foodId}")
    public Food getAFood(@PathVariable String foodId){
        return service.getAFood(foodId);
    }

    @DeleteMapping("/foods/{foodId}")
    public void deleteAFood(@PathVariable String foodId){
        service.deleteFood(foodId);
    }

    @DeleteMapping("/foods")
    public void deleteAllFoods(){
        service.deleteFoodAll();
    }
}

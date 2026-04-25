package com.example.webDviva.Service;

import com.example.webDviva.Model.Food;
import com.example.webDviva.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    @Autowired
    FoodRepository repo;

    public List<Food> getFoods(){
        return repo.findAll();
    }

    public Food saveFood(Food food) {
        return repo.save(food);
    }

    public Food updateFood(Food food) {
        return repo.save(food);
    }

    public void deleteFood(String foodId){
        repo.deleteById(foodId);
    }

    public Food getAFood(String foodId){
        return repo.findById(foodId).orElse(null);
    }

    public void deleteFoodAll(){
        repo.deleteAll();
    }
}

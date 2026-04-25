package com.example.webDviva.Service;

import com.example.webDviva.Model.Food;
import com.example.webDviva.repository.FoodRepositoryBig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceBig {
    @Autowired
    FoodRepositoryBig repo;

    public List<Food> getFoodsBig(){
        return repo.findAll();
    }

    public Food saveFoodBig(Food foodBig) {
        return repo.save(foodBig);
    }

    public Food updateFoodBig(Food foodBig) {
        return repo.save(foodBig);
    }

    public void deleteFoodBig(String foodIdBig){
        repo.deleteById(foodIdBig);
    }

    public Food getAFoodBig(String foodIdBig){
        return repo.findById(foodIdBig).orElse(null);
    }

    public void deleteFoodAllBig(){
        repo.deleteAll();
    }
}

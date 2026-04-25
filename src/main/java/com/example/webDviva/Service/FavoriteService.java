package com.example.webDviva.Service;

import com.example.webDviva.Model.Favorite;
import com.example.webDviva.Model.Food;
import com.example.webDviva.Model.Recipe;
import com.example.webDviva.repository.FavoriteRepository;
import com.example.webDviva.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteService {
    @Autowired
    FavoriteRepository repo;

    public List<Favorite> getFavorites(){
        return repo.findAll();
    }

    public Favorite saveFavorite(Favorite food) {
        return repo.save(food);
    }

    public Favorite updateFavorite(Favorite food) {
        return repo.save(food);
    }

    public void deleteFavorite(String foodId){
        repo.deleteById(foodId);
    }

    public Favorite getAFavorite(String foodId){
        return repo.findById(foodId).orElse(null);
    }

    public void deleteFavoriteAll(){
        repo.deleteAll();
    }

    public List<Favorite> getByOwner(String owner){
        return repo.findByOwner(owner);
    }

    public void deleteByOwner(String owner){ repo.deleteByOwner(owner);    }
}

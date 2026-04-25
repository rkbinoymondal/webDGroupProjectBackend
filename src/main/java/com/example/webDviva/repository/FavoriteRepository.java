package com.example.webDviva.repository;

import com.example.webDviva.Model.Favorite;
import com.example.webDviva.Model.Food;
import com.example.webDviva.Model.Recipe;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, Long> {

    List<Favorite> findByOwner(String owner);

    @Transactional
    void deleteByOwner(String owner);

    @Transactional
    void deleteByOwnerAndFoodId(String owner, String foodId);
}
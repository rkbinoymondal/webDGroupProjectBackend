package com.example.webDviva.repository;

import com.example.webDviva.Model.Favorite;
import com.example.webDviva.Model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, String> {
}
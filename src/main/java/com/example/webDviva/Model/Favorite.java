package com.example.webDviva.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Favorite {
    @Id
    private String foodId;
    private String foodName;
    private String time;
    private String servings;
    private String imageUrl;
    private String description;
    private String owner;
}
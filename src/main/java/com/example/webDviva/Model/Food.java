package com.example.webDviva.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Food {
    @Id
    private String foodId;
    private String foodName;
    private String time;
    private String servings;
    private String imageUrl;
    private String description;
    private String youtubeUrl;
    private String cuisine;
    private String difficulty;
    private String type;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String recipe;
}
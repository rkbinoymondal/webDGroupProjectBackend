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
public class Login {
    @Id
    private String email;
    private String name;
    private String password;
    private String phone;
    private String age;
    private String state;
}
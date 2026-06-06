package com.example.webDviva.Controller;

import com.example.webDviva.Model.Food;
import com.example.webDviva.Model.Login;
import com.example.webDviva.Model.LoginDTO;
import com.example.webDviva.Service.FoodService;
import com.example.webDviva.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class LoginController {
    @Autowired
    LoginService service;

    @GetMapping("/login")
    public List<Login> getAllLogin(){
        return service.getLogin();
    }

    @PostMapping("/login")
    public Login addLogin(@RequestBody Login login) {
        return service.saveLogin(login);
    }

    @PostMapping("/login/userPass")
    public ResponseEntity<?> checkLogin(@RequestBody LoginDTO loginDTO){
        return service.checkLogin(loginDTO);
    }

    @PutMapping("/login")
    public Login updateLogin(@RequestBody Login login) {
        return service.updateLogin(login);
    }

    @GetMapping("/login/{loginId}")
    public Login getALogin(@PathVariable String loginId){
        return service.getALogin(loginId);
    }

    @DeleteMapping("/login/{loginId}")
    public void deleteALogin(@PathVariable String loginId){
        service.deleteLogin(loginId);
    }

    @DeleteMapping("/login")
    public void deleteAllLogin(){
        service.deleteLoginAll();
    }
}

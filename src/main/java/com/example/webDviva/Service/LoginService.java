package com.example.webDviva.Service;

import com.example.webDviva.Model.Food;
import com.example.webDviva.Model.Login;
import com.example.webDviva.Model.LoginDTO;
import com.example.webDviva.repository.FoodRepository;
import com.example.webDviva.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
    @Autowired
    LoginRepository repo;

    public List<Login> getLogin(){
        return repo.findAll();
    }

    public Login saveLogin(Login login) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
        login.setPassword(encoder.encode(login.getPassword()));
        return repo.save(login);
    }

    public Login updateLogin(Login login) {
        return repo.save(login);
    }

    public void deleteLogin(String loginId){
        repo.deleteById(loginId);
    }

    public Login getALogin(String loginId){
        return repo.findById(loginId).orElse(null);
    }

    public void deleteLoginAll(){
        repo.deleteAll();
    }

    public ResponseEntity<?> checkLogin(LoginDTO loginDTO) {
        Login loginDetails = getALogin(loginDTO.getEmail());
        if (loginDetails == null){
            return ResponseEntity.badRequest().body("Email Not Found");
        }
        else{
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
            String databaseHashedPassword = loginDetails.getPassword();
            String inputPassword = loginDTO.getPassword();
            if (encoder.matches(inputPassword, databaseHashedPassword)){
                return ResponseEntity.ok("Login Successful");
            }
            else{
                return ResponseEntity.internalServerError().body("Incorrect Password");
            }
        }
    }
}

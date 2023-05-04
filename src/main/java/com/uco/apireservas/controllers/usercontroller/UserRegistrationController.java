package com.uco.apireservas.controllers.usercontroller;

import com.uco.apireservas.domain.user.UserUbico;
import com.uco.apireservas.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserRegistrationController {
    @Autowired
    private UserService userService;

    @PostMapping
    public UserUbico guardar (@RequestBody UserUbico userUbico){
        return userService.create(userUbico);
    }

    @GetMapping("/user/all")
    public ResponseEntity<List<UserUbico>> ListarUsuarios () {
        return ResponseEntity.ok(userService.getAllUsers());

    }

    @DeleteMapping
    public ResponseEntity<Object> EliminarUsuario (@RequestBody UserUbico userUbico) {
        userService.delete(userUbico);
        return ResponseEntity.ok().build();

    }

    @GetMapping (name = "{id}")
    public ResponseEntity<Optional<UserUbico>> ListarUsuario (@PathVariable ("id") Integer id){
        return ResponseEntity.ok(userService.findById(id));

    }
}

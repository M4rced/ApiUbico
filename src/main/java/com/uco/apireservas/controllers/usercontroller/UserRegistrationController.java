package com.uco.apireservas.controllers.usercontroller;

import com.uco.apireservas.domain.user.UserUbico;
import com.uco.apireservas.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.List;

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
    public ResponseEntity<List<UserUbico>> ListarUsuario () {
        return ResponseEntity.ok(userService.getAllUser());

    }

    @DeleteMapping
    public ResponseEntity<Object> EliminarUsuario (@RequestBody UserUbico userUbico) {
        userService.delete(userUbico);
        return ResponseEntity.ok().build();

    }

    @GetMapping (name = "{id}")
    public ResponseEntity<UserUbico> ListarUsuario (@PathVariable ("id") Integer id){
        return ResponseEntity.ok(userService.findById(id));

    }
}

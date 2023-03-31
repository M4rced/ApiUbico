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
@RequestMapping("/registration")
public class UserRegistrationController {
    @Autowired
    private UserService userService;

    @PostMapping
    public Mono<UserUbico> guardar (@RequestBody UserUbico userUbico){
        UserUbico temporal = userService.create(userUbico);

        try{
            return Mono.create(new URI("/registration"+userService.getId())).block();
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    public ResponseEntity<List<UserUbico>> ListarUsuario (@RequestBody UserUbico userUbico) {
        return ResponseEntity.ok(userService.getAllUser());

    }

    @DeleteMapping
    public ResponseEntity<void> EliminarUsuario (@RequestBody UserUbico userUbico) {
        userService.delete(userUbico);
        return ResponseEntity.ok().build();

    }

    @GetMapping (name = "{id}")
    public ResponseEntity<List<UserUbico>> ListarUsuario (@PathVariable ("id") Integer id){
        return ResponseEntity.ok(userService.findById(id));

    }
}

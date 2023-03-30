package com.uco.apireservas.services.user;

import com.uco.apireservas.domain.user.UserUbico;
import com.uco.apireservas.controllers.dto.UserRegistrationDto;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
    UserUbico save(UserRegistrationDto registrationDto);
}

package com.uco.apireservas.services.user;

import com.uco.apireservas.domain.user.User;
import com.uco.apireservas.controllers.dto.UserRegistrationDto;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}

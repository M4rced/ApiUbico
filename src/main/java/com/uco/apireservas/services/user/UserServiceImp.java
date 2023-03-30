package com.uco.apireservas.services.user;

import com.uco.apireservas.domain.user.UserUbico;
import com.uco.apireservas.repository.user.UserRepository;
import com.uco.apireservas.controllers.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepository userRepository;

    /*@Autowired
    private BCryptPasswordEncoder passwordEncoder;*/

    @Override
    public UserUbico save(UserRegistrationDto registrationDto) {
        UserUbico userUbico = new UserUbico(registrationDto.getFirstName(),registrationDto.getLastname(),
                registrationDto.getIdentificationType(),registrationDto.getIdentificationNumber(),
                registrationDto.getTelephoneNumber(),registrationDto.getEmail(),registrationDto.getUcoid(),
                registrationDto.getUsername(),registrationDto.getPassword());
        return userRepository.save(userUbico);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}

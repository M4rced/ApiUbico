package com.uco.apireservas.services.user;

import com.uco.apireservas.domain.user.User;
import com.uco.apireservas.repository.user.UserRepository;
import com.uco.apireservas.controllers.dto.UserRegistrationDto;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{

    private UserRepository userRepository;

    /*@Autowired
    private BCryptPasswordEncoder passwordEncoder;*/

    public UserServiceImp(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getFirstName(),registrationDto.getLastname(),
                registrationDto.getIdentificationType(),registrationDto.getIdentificationNumber(),
                registrationDto.getTelephoneNumber(),registrationDto.getEmail(),registrationDto.getUcoid(),
                registrationDto.getUsername(),registrationDto.getPassword());
        return userRepository.save(user);
    }


}

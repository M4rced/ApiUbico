package com.uco.apireservas.services.jwt;

import com.uco.apireservas.domain.user.UserUbico;
import com.uco.apireservas.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.print.attribute.standard.RequestingUserName;
import java.util.ArrayList;
@RestController
@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository UserRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserUbico user =  UserRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new User(user.getUsername(), user.getPassword(),
                new ArrayList<>());
    }

    public UserUbico save(UserUbico UserUbico) {
        UserUbico.setPassword(bcryptEncoder.encode(UserUbico.getPassword()));
        return UserRepository.save(UserUbico);
    }
}

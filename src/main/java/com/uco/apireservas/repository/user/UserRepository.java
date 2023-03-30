package com.uco.apireservas.repository.user;

import com.uco.apireservas.domain.user.UserUbico;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository <UserUbico, Long>  {
    UserUbico findByEmail(String email);
    ResponseEntity findByUsername(String username);

}

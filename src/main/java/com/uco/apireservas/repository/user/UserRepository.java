package com.uco.apireservas.repository.user;

import com.uco.apireservas.domain.user.UserUbico;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository <UserUbico, Integer>  {
    UserUbico findByEmail(String email);
    UserUbico findByUsername(String username);

}
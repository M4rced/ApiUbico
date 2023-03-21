package com.uco.apireservas.repository.user;

import com.uco.apireservas.domain.user.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository <User, Long>  {
    User findByEmail(String email);

}

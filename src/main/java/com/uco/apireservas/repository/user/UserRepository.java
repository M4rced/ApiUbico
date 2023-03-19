package com.uco.apireservas.repository.user;

import com.uco.apireservas.domain.user.User;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

import java.util.List;

public interface UserRepository extends JpaRepository<User, long> {
}

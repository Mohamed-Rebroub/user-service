package com.example.userservice.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.userservice.users.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

		Users findByUsername(String username);

}

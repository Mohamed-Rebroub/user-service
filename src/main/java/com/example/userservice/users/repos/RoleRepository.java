package com.example.userservice.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.userservice.users.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByRole(String role);
	
}

package com.example.userservice.users.service;

import java.util.List;

import com.example.userservice.users.entities.Role;
import com.example.userservice.users.entities.Users;

public interface UserService {
	Users saveUser(Users user);
	Users findUserByUsername (String username);
	Role addRole(Role role);
	Users addRoleToUser(String username, String rolename);
	List<Users> findAllUsers();


}

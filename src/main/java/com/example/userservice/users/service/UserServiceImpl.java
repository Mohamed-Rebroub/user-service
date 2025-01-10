package com.example.userservice.users.service;

import java.util.List;

import com.example.userservice.users.repos.RoleRepository;
import com.example.userservice.users.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.userservice.users.entities.Role;
import com.example.userservice.users.entities.Users;

@Transactional
@Service
public class UserServiceImpl  implements UserService{

	@Autowired
    UserRepository userRep;
	
	@Autowired
    RoleRepository roleRep;
	
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public Users saveUser(Users user) {
		
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		return userRep.save(user);
	}

	@Override
	public Users addRoleToUser(String username, String rolename) {
		Users usr = userRep.findByUsername(username);
		Role r = roleRep.findByRole(rolename);
		
		usr.getRoles().add(r);
		return usr;
	}

	
	@Override
	public Role addRole(Role role) {
		return roleRep.save(role);
	}

	@Override
	public Users findUserByUsername(String username) {
		return userRep.findByUsername(username);
	}

	@Override
	public List<Users> findAllUsers() {
		return userRep.findAll();
	}

}

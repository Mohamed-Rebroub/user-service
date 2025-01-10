package com.example.userservice.users.restControllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.userservice.users.entities.Users;
import com.example.userservice.users.service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserRestController {
	@Autowired
	UserService userService;

	@GetMapping("all")
	public List<Users> getAllUsers() {
		return userService.findAllUsers();
	}

}


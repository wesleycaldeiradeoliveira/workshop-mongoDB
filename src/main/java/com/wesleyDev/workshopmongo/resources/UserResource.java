package com.wesleyDev.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wesleyDev.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public  ResponseEntity<List<User>> findAll() {
		User Neuza = new User("1", "Neuza", "Neuza@gmail.com");
		User Miguel = new User("2", "Miguel", "Miguel@gmail.com");

		List<User> list = new ArrayList<>();

		list.addAll(Arrays.asList(Neuza, Miguel));
		return ResponseEntity.ok().body(list);
	}
}

package com.wesleyDev.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.wesleyDev.workshopmongo.domain.User;
import com.wesleyDev.workshopmongo.repository.UserRepository;

@Configuration
public class instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		userRepository.deleteAll();

		User dayla = new User(null, "dayla soeiro", "dayla@gmail.com");
		User miguel = new User(null, "miguel alecrim", "luluzinha@gmail.com");
		User neuza = new User(null, "neuza caldeira", "neuza@gmail.com");

		userRepository.saveAll(Arrays.asList(dayla, miguel, neuza));

	}

}

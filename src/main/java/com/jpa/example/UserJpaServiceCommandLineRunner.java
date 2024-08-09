package com.jpa.example;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.example.jpa.service.UserJpaRepository;
import com.jpa.example.userentity.User;
@Component
public class UserJpaServiceCommandLineRunner implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(UserJpaServiceCommandLineRunner.class);
	@Autowired
	UserJpaRepository jpaRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User user = new User("Heman", "Admin");
		jpaRepository.save(user);
		User user1 = new User("Bhargav", "Admin");
		jpaRepository.save(user1);
		log.info("New User Created" + user1);
		
		
		Optional<User> usr= jpaRepository.findById(1L);
		log.info("Found User " + usr);
		
		boolean found  = jpaRepository.existsById(usr.get().getId());
		log.info("Found User for id :"+ usr.get().getId() + found);
		
		List<User> user_list = jpaRepository.findAll();
		log.info("Found Users "+ user_list);
	}

}

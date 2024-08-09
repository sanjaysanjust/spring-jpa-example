package com.jpa.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.example.dao.service.UserDaoService;
import com.jpa.example.userentity.User;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	@Autowired
	UserDaoService daoService;

	@Override
	public void run(String... args) throws Exception {

		User user = new User("Sanjay", "Super Admin");
		Long id = daoService.insert(user);
		log.info("New User Created" + user);

	}

}

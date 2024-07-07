package com.aashish.IntroductionProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //-> This annotation specifies that this is the starting point of our app, One application should have only one annotation
public class IntroductionProjectApplication implements CommandLineRunner {

	@Autowired
	Apple obj;

	@Autowired
	Apple obj1;

	@Autowired
	Banana banana;

	@Autowired //example of field injection
	DBService dbService;

	public static void main(String[] args) {
		SpringApplication.run(IntroductionProjectApplication.class, args);
//		Apple obj = new Apple();
//		obj.eatApple(); We dont have to create obbjevt using new keyword



	}

	@Override
	public void run(String... args) throws Exception {
//		obj.eatApple();
//		banana.eatBanana();
//		obj1.eatApple();
		System.out.println(dbService.getData());
	}

}

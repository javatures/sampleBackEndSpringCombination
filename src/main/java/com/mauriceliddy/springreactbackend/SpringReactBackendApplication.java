package com.mauriceliddy.springreactbackend;

import com.mauriceliddy.springreactbackend.Model.User;
import com.mauriceliddy.springreactbackend.Repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringReactBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringReactBackendApplication.class, args);
	}

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public void run(String... args) throws Exception {
		this.userRepo.save(new User("Maurice", "Liddy","mliddy@gmail.com"));
		this.userRepo.save(new User("Daniel", "Kehm","danielkjehm@gmail.com"));
		this.userRepo.save(new User("Kara", "Kliesing","kkliesing@gmail.com"));
	}

}

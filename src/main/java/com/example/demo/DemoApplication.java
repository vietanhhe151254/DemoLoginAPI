package com.example.demo;

import com.example.demo.user.User;
import com.example.demo.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;
import sun.nio.cs.ext.DoubleByte;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Autowired
	PasswordEncoder passwordEncoder;
	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		System.out.println(passwordEncoder.encode("admin")
		);
	}
}

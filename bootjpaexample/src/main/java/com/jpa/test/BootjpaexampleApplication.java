package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
//		User user = new User();
//		user.setName("Rohit Mittal");
//		user.setCity("Delhi");
//		user.setStatus("I am Java Developer");
//		
		//Saving single user
//		User user1 = userRepository.save(user);
//		System.out.println(user1);
		
		//Save multiple user
//		User user1 = new User();
//		user1.setName("Rahul");
//		user1.setCity("city1");
//		user1.setStatus("Web Dev");
//		
//		User user2 = new User();
//		user2.setName("Rakesh");
//		user2.setCity("city2");
//		user2.setStatus("Data Engineer");
//		
//		List<User> users = List.of(user1, user2);
//		
//		Iterable<User> result = userRepository.saveAll(users);
//		
//		result.forEach(user -> {
//			System.out.println(user);
//		});

		//update user
		Optional<User> optional = userRepository.findById(3);
		
		User user = optional.get();
		
		user.setName("Ramesh");
		
		User result = userRepository.save(user);
		List<User> name = userRepository.findByName("Rahul");
		System.out.println(result);

		name.forEach(e -> System.out.println(e));
		
		
	}

}

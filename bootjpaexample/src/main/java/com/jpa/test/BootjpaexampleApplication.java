package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
	
		UserRepository userRepository = context.getBean(UserRepository.class);
//		User user =new User();
//		user.setName("aman");
//		user.setCity("banglore");
//		user.setStatus("active node coder");
//		User user1 = userRepository.save(user);
//		System.out.println(user1);
//		
////		
//		
//		Optional<User> optional=userRepository.findById(1);
//		User user=optional.get();
//		user.setName("ankur");
//		User res = userRepository.save(user);
//		
//		System.out.println(res);
		
//		hosw to get data
		//findById- return optional containing your datau
		
//		all data
//		Iterable<User> itr = userRepository.findAll();
//		Iterator<User> iterator = itr.iterator();	
//		while (iterator.hasNext()) {
//			User user=iterator.next();
//				System.out.println(user);
//				
//			}
		
//		itr.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub
//				SystgetUserByNameAndCityem.out.println(t);
//				
//			}
//		});
//		itr.forEach(user->System.out.println(user));
			
		
		//Delete
//		userRepository.deleteById(1);
//		System.out.println("deleted");
//		Iterable<User> findAll = userRepository.findAll();	
//		findAll.forEach(user->System.out.println(user));
//		userRepository.deleteAll(findAll);
//		
//		List<User> user = userRepository.findByName("aman");
//		user.forEach(e->System.out.println(e));
		
//		List<User> users = userRepository.findByNameAndCity("aman", "banglore");
//		users.forEach(e->System.out.println(e));
		
//		List<User> allUser = userRepository.getAllUser();
//	allUser.forEach(e->System.out.println(e));
		
//		List<User> userByName = userRepository.getUserByName("aman");
//		userByName.forEach(e->System.out.println(e));
//		List<User> getUserByNameAndCity = userRepository.getUserByNameAndCity("aman","bangalore");
//		getUserByNameAndCity.forEach(e->System.out.println(e));
//		
		
		userRepository.getUsers().forEach(e->System.out.println(e));
		
	}
		
	}


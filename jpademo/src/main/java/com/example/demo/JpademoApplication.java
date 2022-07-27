package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.demo.dao.UserRepository;
import com.example.demo.entities.User;

@SpringBootApplication
public class JpademoApplication {

	public static void main(String[] args) {
	
	ApplicationContext context = SpringApplication.run(JpademoApplication.class, args);
	UserRepository userRepository =context.getBean(UserRepository.class);
	
	//Add operation
//	
//	User user1= new User();
//	
//	user1.setName("Kajal");
//	user1.setCity("Agra");
//	
//	User user2= new User();
//	user2.setName("Neha");
//	user2.setCity("Delhi");
//	
//	User user9= new User();
//	user9.setName("Manisha");
//	user9.setCity("Noida");
//	
//	 ArrayList<User> a = new ArrayList<User>();
//	 a.add(user1);
//	 a.add(user2);
//	 a.add(user9);
//	
//	Iterable<User> result = userRepository.saveAll(a);
//	result.forEach(user->{
//		System.out.println(user);
//	});
	System.out.println("--------------------------------");
	//  Update operation
	
//	Optional<User> optional = userRepository.findById(9);
//	
//	User user = optional.get();
//	System.out.println(user);
//	
//	user.setName("Neha Kumari");
//	user.setCity("Agra");
//	
//	User user3=userRepository.save(user);
//	System.out.println(user3);
//	
//	System.out.println("--------------------------------");
//   //***Print the data
//	Iterable<User> result1=userRepository.findAll();
//    result1.forEach(us->{
//    	System.out.println(us);
//    });
//    System.out.println("--------------------------------");
////	Delete operation
//    userRepository.deleteById(9);
//    System.out.println("Deleted");
//    
//    Iterable<User> result2=userRepository.findAll();
//    result2.forEach(us1->{
//  	System.out.println(us1);
//  });
//	
    System.out.println("--------------------------------");
    //Custom method 
	List<User> l=userRepository.findByName("Kajal");
	 l.forEach(us2->{
		 System.out.println(us2);
	 });
	 System.out.println("--------------------------------");
	//Custom method
	List<User> l1=userRepository.getUser();
	 l1.forEach(us3->{
		 System.out.println(us3);
	 });
	
	}

}

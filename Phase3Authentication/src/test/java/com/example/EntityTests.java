package com.example;

import com.example.entities.User;
import com.example.repositories.UserRepository;
import com.example.services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class EntityTests {

	@Test
	public void getAndSetPassword() {
		User testUser = new User();
		
		testUser.setPassword("mypassword");
		assertEquals(testUser.getPassword(),"mypassword");
	}
	
	@Test
	public void getAndSetName() {
		User testUser = new User();
		
		testUser.setName("nithin");
		assertEquals(testUser.getName(),"nithin");
	}
	
	@Test
	public void getAndSetEmail() {
		User testUser = new User();
		
		testUser.setEmail("nithin@email.com");
		assertEquals(testUser.getEmail(),"nithin@email.com");
	}
	
	@Test
	public void checkToString() {
		User testUser = new User();
		
		assertNotNull(testUser.toString());
	}
	
	@Test
	public void checkConstructor() {
		User testUser = new User("nithin","nithin@email.com","123");
		
		User checkUser = new User();
		checkUser.setName("nithin");
		checkUser.setEmail("nithin@email.com");
		checkUser.setPassword("123");
		
		assertEquals(testUser.getName(), checkUser.getName());
		assertEquals(testUser.getEmail(), checkUser.getEmail());
		assertEquals(testUser.getPassword(), checkUser.getPassword());
	}
	
	@Test
	public void testDefaultConstructor() {
		User testUser = new User();
		
		assertNotNull(testUser);
	}
}
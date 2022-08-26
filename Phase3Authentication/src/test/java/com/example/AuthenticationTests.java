package com.example;

import com.example.entities.User;
import com.example.repositories.UserRepository;
import com.example.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;



@DataJpaTest

public class AuthenticationTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    
    @Test
    public void returnUserFromName() {
        User testUser = new User();
        testUser.setName("newTest");
        testUser.setEmail("test@email.com");
        testUser.setPassword("testpw");
        entityManager.persist(testUser);
        entityManager.flush();

        User found = userRepository.findByName(testUser.getName());

        assertEquals(found.getName(), testUser.getName());
    }

    @Test
    public void passwordNotNull() {
    	
		Iterable<User> users = userRepository.findAll();
		for(User u: users)
			assertNotNull(u.getPassword());
    }

    @Test
    public void nameNotNull() {
    	
		Iterable<User> users = userRepository.findAll();
		for(User u: users)
			assertNotNull(u.getName());
    }

    @Test
    public void emailNotNull() {
    	
		Iterable<User> users = userRepository.findAll();
		for(User u: users)
			assertNotNull(u.getEmail());
    }


}
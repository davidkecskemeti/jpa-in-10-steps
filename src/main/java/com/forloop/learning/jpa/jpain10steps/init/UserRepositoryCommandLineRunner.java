package com.forloop.learning.jpa.jpain10steps.init;

import com.forloop.learning.jpa.jpain10steps.entity.User;
import com.forloop.learning.jpa.jpain10steps.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("FORLoop", "Admin");
        userRepository.save(user);
        LOGGER.info("New user is created: " + user);

        Optional<User> userWithIdOne=userRepository.findById(1L);
        LOGGER.info("user is retrieved: "+userWithIdOne);

        List<User> userList=userRepository.findAll();
        LOGGER.info("All users: "+userList);
    }
}

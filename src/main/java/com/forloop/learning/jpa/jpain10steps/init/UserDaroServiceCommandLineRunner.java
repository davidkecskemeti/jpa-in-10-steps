package com.forloop.learning.jpa.jpain10steps.init;

import com.forloop.learning.jpa.jpain10steps.entity.User;
import com.forloop.learning.jpa.jpain10steps.service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaroServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserDaroServiceCommandLineRunner.class);

    @Autowired
    private UserDAOService userDAOService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("FORLoop", "Admin");
        long insert = userDAOService.insert(user);
        LOGGER.info("New user is created: " + user);
    }
}

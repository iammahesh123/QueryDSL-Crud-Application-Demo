package com.gfg.querydslcrudapplication;

import com.gfg.querydslcrudapplication.model.QUser;
import com.gfg.querydslcrudapplication.repository.UserRepository;
import com.gfg.querydslcrudapplication.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MyRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        var qUser = QUser.user;

        User initialUser = new User(null, "John Doe", 30);
        initialUser = userRepository.save(initialUser);
        logger.info("Initial user inserted: {}", initialUser);

        // Generate and insert 25 sample users randomly
        List<User> sampleUsers = generateSampleUsers(25);
        sampleUsers = (List<User>) userRepository.saveAll(sampleUsers);
        logger.info("25 sample users inserted: {}", sampleUsers);

        // Query for users with age less than 29 and name ending with "est"
        List<User> users = (List<User>) userRepository.findAll(
                qUser.name.endsWith("est").and(qUser.age.lt(29))
        );
        logger.info("Users with age less than 29 and name ending with 'est': {}", users);

        // Query for users with age greater than or equal to 30
        List<User> usersWithAgeAbove30 = (List<User>) userRepository.findAll(
                qUser.age.goe(30)
        );
        logger.info("Users with age greater than or equal to 30: {}", usersWithAgeAbove30);
    }

    private List<User> generateSampleUsers(int count) {
        List<User> users = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            String name = "User" + (i + 1);
            int age = random.nextInt(100); // Random age between 0 and 99
            users.add(new User(null, name, age));
        }
        return users;
    }
}

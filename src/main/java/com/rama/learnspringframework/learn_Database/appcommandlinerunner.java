package com.rama.learnspringframework.learn_Database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class appcommandlinerunner implements CommandLineRunner {
    @Autowired
    private jpadatabase repository;

    @Override
    public void run(String... args) throws Exception {
repository.insert(new Course(1,"Ram","Chandra"));


    }
}

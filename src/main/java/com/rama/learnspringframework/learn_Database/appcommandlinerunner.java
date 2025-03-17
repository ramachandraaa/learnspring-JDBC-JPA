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
        repository.insert(new Course(2,"Soma","Shekar"));
        repository.insert(new Course(3,"Vijay","Kumar"));
System.out.println(repository.findById(1)

);
repository.deleteById(3);
    }
}

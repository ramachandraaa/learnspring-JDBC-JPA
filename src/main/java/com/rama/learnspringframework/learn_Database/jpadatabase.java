package com.rama.learnspringframework.learn_Database;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class jpadatabase {
    @PersistenceContext
private EntityManager entityManager;
    public void insert(Course course)
    {
entityManager.merge(course);
    }
}

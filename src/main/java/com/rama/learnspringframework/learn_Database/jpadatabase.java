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
    public Course findById(int id)
    {
     return    entityManager.find(Course.class,id);
    }
    public void deleteById(int id)
    {
       Course c= entityManager.find(Course.class,id);
       entityManager.remove(c);
    }
}

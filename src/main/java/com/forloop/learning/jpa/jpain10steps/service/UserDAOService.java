package com.forloop.learning.jpa.jpain10steps.service;

import com.forloop.learning.jpa.jpain10steps.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class UserDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user){
        //open transaction
        //make the change
        entityManager.persist(user);
        //close the transaction
        return user.getId();
    }
}

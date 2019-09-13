package com.forloop.learning.jpa.jpain10steps.repository;

import com.forloop.learning.jpa.jpain10steps.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

package com.sda.zd18.gr3.repository;

import com.sda.zd18.gr3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Override
    List<User> findAll();

    @Override
    User save(User entity);

}


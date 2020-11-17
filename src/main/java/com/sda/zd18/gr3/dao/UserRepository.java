package com.sda.zd18.gr3.dao;

import com.sda.zd18.gr3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

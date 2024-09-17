package com.example.vikram.Fullstack.app.repository;

import com.example.vikram.Fullstack.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

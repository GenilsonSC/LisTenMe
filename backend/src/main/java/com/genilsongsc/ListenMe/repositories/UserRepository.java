package com.genilsongsc.ListenMe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.genilsongsc.ListenMe.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {

	User findByEmail(String email);
}

package com.jpa.example.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.example.userentity.User;

public interface UserJpaRepository extends JpaRepository<User, Long>{

}

package com.jpa.example.dao.service;

import org.springframework.stereotype.Repository;

import com.jpa.example.userentity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class UserDaoService {
	@PersistenceContext
	private EntityManager entityManager;

	public long insert(User user) {

		entityManager.persist(user);

		return user.getId();

	}

}

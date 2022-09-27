package com.ty.school.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.ReferenceBook;

public class ReferenceBookDAO {
	public ReferenceBook saveRefernceBook(ReferenceBook referenceBook) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(referenceBook);
		entityTransaction.commit();
		return referenceBook;

	}

	public ReferenceBook findReferenceBookById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		ReferenceBook referenceBook = entityManager.find(ReferenceBook.class, id);
		if (referenceBook != null)
			return referenceBook;
		else
			return null;
	}

	public boolean deleteReferenceBook(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
		ReferenceBook referenceBook = entityManager.find(ReferenceBook.class, id);
		if (referenceBook != null) {
			entityTransaction.begin();
			entityManager.remove(referenceBook);
			entityTransaction.commit();
			return true;
		} else
			return false;
	}

	public ReferenceBook updateStudent(ReferenceBook referenceBook) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(referenceBook);
		entityTransaction.commit();
		return referenceBook;
	}
}
package com.jsp.map.cascode.joincolumn;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karuna");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Bank1 bank1 = new Bank1();
		bank1.setName("(ICICI");

		List<Branch1> li = new ArrayList<Branch1>();
		Branch1 branch1 = new Branch1();
		branch1.setBank(bank1);
		branch1.setIFSC("jad345");
		branch1.setName("icici1");

		Branch1 branch2 = new Branch1();
		branch2.setBank(bank1);
		branch2.setIFSC("jad345");
		branch2.setName("icici2");
		li.add(branch1);
		li.add(branch2);
		bank1.setBranches(li);
		
		entityTransaction.begin();
		entityManager.persist(bank1);
		entityTransaction.commit();

	}

}

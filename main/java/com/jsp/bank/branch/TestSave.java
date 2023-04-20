package com.jsp.bank.branch;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karuna");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	Bank bank = new Bank();
	bank.setName("HDFC");
	List<Branch> li = new ArrayList<Branch>();
	Branch branch = new Branch();
	branch.setIFSC("67tyh");
	branch.setName("b1");
	branch.setBank(bank);
	
	
	Branch br2 = new Branch();
	br2.setBank(bank);
	br2.setIFSC("khg356");
	br2.setName("b2");
	li.add(br2);
	li.add(branch);
	bank.setBranches(li);
			

	
	entityTransaction.begin();
	entityManager.persist(bank);
	entityManager.persist(branch);
	entityManager.persist(br2);
	entityTransaction.commit();
}

}

package com.cg.jhl1.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jhl1.entity.Author;
import com.cg.jhl1.util.JPAUtil;

public class App01 {

	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		Author a1=new Author(12L,"swarna","rekha","gangabathina",1234567891);
		Author a2=new Author(13L,"priya","varshini","putta",1234566291);
		Author a3=new Author(14L,"dhanush","kumar","gangabathina",1434567891);
		Author a4=new Author(15L,"subbu","kumar","gangabathina",983456789);
		Author a5=new Author(16L,"raja","lalu","gangabathina",623456789);
		Author a6=new Author(17L,"sudha","rani","inugunta",1237567891);
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		em.persist(a4);
		em.persist(a5);
		em.persist(a6);
		txn.commit();
		em.close();
		JPAUtil.shutdown();
	}

}

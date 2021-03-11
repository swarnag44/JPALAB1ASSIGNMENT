package com.cg.jhl1.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jhl1.entity.Author;
import com.cg.jhl1.util.JPAUtil;

public class App02 {

	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		Long authorId=sc.nextLong();
		System.out.println("enter firstname:");
		String firstName=sc.next();
		Author author =em.find(Author.class,authorId);
		
		if(author==null) {
			System.out.println("Product id #"+authorId+"not found");
		}else {
			EntityTransaction txn=em.getTransaction();
			author.setFirstName(firstName);
			txn.begin();
			em.merge(author);
			txn.commit();
		}
		sc.close();
		em.close();
		JPAUtil.shutdown();
	}

	}

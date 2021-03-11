package com.cg.jhl1.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jhl1.entity.Author;
import com.cg.jhl1.util.JPAUtil;

public class App03 {

	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id:");
		Long authorId=sc.nextLong();
		
		Author author =em.find(Author.class,authorId);
		
		if(author==null) {
			System.out.println("id #"+authorId+"not found");
		}else {
			EntityTransaction txn=em.getTransaction();
			txn.begin();
			em.remove(author);
			txn.commit();
		}
		sc.close();
		em.close();

	}

}

package com.cg.jhl1.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.cg.jhl1.entity.Author;
import com.cg.jhl1.util.JPAUtil;



public class App04 {

	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		Long authorId=sc.nextLong();
		Author author=em.find(Author.class,authorId);
		if(author!=null)
			System.out.println(author);
		else 
			System.out.println("employee not found");
		em.close();
		}

	}

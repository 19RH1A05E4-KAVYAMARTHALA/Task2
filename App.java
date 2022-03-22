package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.Scanner;

public class App 
{
	private static ApplicationContext context;
    public static void main( String[] args )
    {
    	context =new ClassPathXmlApplicationContext("com/spring/cfg.xml");
    	JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		System.out.println("Enter 1.Insert 2.Delete 3.Update 4.Exit");
    		System.out.println("Enter your choice");
    	int ch = sc.nextInt();
    	switch(ch) {
    	case 1 :
    		String q1 = "insert into student(id,name,branch,section,city,state,zipcode) value(?,?,?,?,?,?,?)";
    		System.out.println("Enter Id");
    		int q11 = sc.nextInt();
    		System.out.println("Enter name");
    		String q12 = sc.next();
    		System.out.println("Enter branch");
    		String q13 = sc.next();
    		System.out.println("Enter section");
    		String q14 = sc.next();
    		System.out.println("Enter city");
    		String q15 = sc.next();
    		System.out.println("Enter state");
    		String q16 = sc.next();
    		System.out.println("Enter zipcode");
    		long q17 = sc.nextLong();
    		template.update(q1,q11,q12,q13,q14,q15,q16,q17);
    		System.out.println("Query executed");
    		break;
 
    	case 2 :
    		String q2 = "delete from student where id=?";
    		System.out.println("Enter Id");
    		int q21 = sc.nextInt();
    		template.update(q2,q21);
    		System.out.println("Query executed");
    		break;
    	
    	case 3 :
    		second:
    		while(true) {
    			System.out.println("Enter 1.To update name 2.To update branch 3.To update section 4.To update city 5.To update state 6.To update zipcode 7. Exit ");
    			int n = sc.nextInt();
    			switch(n) {
    				case 1 : 
    					String q31 = "update student set name=? where id=?";
    					System.out.println("Enter name");
    					String q311 = sc.next();
    					System.out.println("Enter Id");
    					int q312 = sc.nextInt();
    					template.update(q31,q311,q312);
    					System.out.println("Query executed");
    					break;
    				case 2 : 
    					String q32 = "update student set branch=? where id=?";
    					System.out.println("Enter branch");
    					String q321 = sc.next();
    					System.out.println("Enter Id");
    					int q322 = sc.nextInt();
    					template.update(q32,q321,q322);
    					System.out.println("Query executed");
    					break;
    				case 3 : 
    					String q33 = "update student set section=? where id=?";
    					System.out.println("Enter section");
    					String q331 = sc.next();
    					System.out.println("Enter Id");
    					int q332 = sc.nextInt();
    					template.update(q33,q331,q332);
    					System.out.println("Query executed");
    					break;
    				case 4 : 
    					String q34 = "update student set city=? where id=?";
    					System.out.println("Enter city");
    					String q341 = sc.next();
    					System.out.println("Enter Id");
    					int q342 = sc.nextInt();
    					template.update(q34,q341,q342);
    					System.out.println("Query executed");
    					break;
    				case 5 : 
    					String q35 = "update student set state=? where id=?";
    					System.out.println("Enter state");
    					String q351 = sc.next();
    					System.out.println("Enter Id");
    					int q352 = sc.nextInt();
    					template.update(q35,q351,q352);
    					System.out.println("Query executed");
    					break;
    				case 6 : 
    					String q36 = "update student set zipcode=? where id=?";
    					System.out.println("Enter zipcode");
    					String q361 = sc.next();
    					System.out.println("Enter Id");
    					long q362 = sc.nextLong();
    					template.update(q36,q361,q362);
    					System.out.println("Query executed");
    					break;
    				case 7 : 
    		    		break second;
    			}
    		}
    		break;
    	case 4 : 
    		sc.close();
    		java.lang.System.exit(0);
    		break;
    	}
    }
}
}

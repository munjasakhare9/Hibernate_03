package com.demo.client;

import org.hibernate.Session;

import com.demo.entity.Employee;
import com.demo.util.HBUtils;

public class App {
	public static void main(String[] args) {
		Session session = HBUtils.sf.openSession();
		//Transaction tx=session.beginTransaction();
		for(int i=1;i<=6;i++) {
			Employee e=session.get(Employee.class,i);
			System.out.println(e);
			System.out.println(e.getLaptop());
		}
		//tx.commit();
		session.close();
	}
}

package com.demo.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HBUtils {
	public static SessionFactory sf = new Configuration().configure().buildSessionFactory();

	/*
	 * Configuration cfg = new Configuration().configure(); SessionFactory sf =
	 * cfg.buildSessionFactory(); Session session = sf.openSession();
	 */
}

package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DaoService {

	@SuppressWarnings("deprecation")
	public static SessionFactory getSessionFactory() {
		return new Configuration().configure("hibernateConfig.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
	}

	public static Session getSession() {
		return getSessionFactory().getCurrentSession();
	}
}

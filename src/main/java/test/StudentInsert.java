package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentInsert {

	String name, field;
	int enrId;

	public static void insertStudent(String name, int enrId, String field) {

		SessionFactory sessionFactory = DaoService.getSessionFactory();
		Session session = DaoService.getSession();

		try {

			session.beginTransaction();

			Student st1 = new Student(name, enrId, field);
			System.out.println("inserting record...........");
			session.save(st1);

			session.getTransaction().commit();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			sessionFactory.close();
		}
	}

}

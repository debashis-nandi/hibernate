package com.global.hb;

import org.hibernate.Session;

public class Delete {
	public static void main(String[] args) {

		Session session = HibernateUtil.getSession();
		AdminLogin objAdminLogin = session.get(AdminLogin.class, 2);

		session.beginTransaction();
		session.delete(objAdminLogin);
		session.getTransaction().commit();
		session.close();

	}
}

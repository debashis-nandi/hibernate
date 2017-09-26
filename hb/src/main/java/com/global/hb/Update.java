package com.global.hb;

import org.hibernate.Session;

public class Update {
	public static void main(String[] args) {

		Session session1 = HibernateUtil.getSession();
		session1.beginTransaction();
		AdminLogin objAdminLogin = session1.get(AdminLogin.class, 1);
		if(objAdminLogin != null ){
		objAdminLogin.setPassword("debashis-changed");
		session1.update(objAdminLogin);
		System.out.print("=== Record has been updated.");
		}
		session1.getTransaction().commit();
		session1.close();
	}
}

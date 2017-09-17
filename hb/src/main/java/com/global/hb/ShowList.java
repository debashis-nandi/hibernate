/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.global.hb;

import java.util.Iterator;
import java.util.List;
import org.hibernate.*;

/**
 *
 * @author DN9
 */
public class ShowList {

	public static void main(String[] args) {

		Session session1 = HibernateUtil.getSession();
		session1.beginTransaction();

		Query query = session1.createQuery("FROM AdminLogin");
		List<AdminLogin> adminlist = query.list();
		String t = "";
		for (Iterator<AdminLogin> iterator = adminlist.iterator(); iterator.hasNext();) {
			AdminLogin adm = iterator.next();
			System.out.print("\n=================================================================\n");
			System.out.print(" User ID: " + adm.getUserid());
			System.out.print(" || Password : " + adm.getPassword());
			System.out.print("\n=================================================================\n");
			System.out.print("\n=================================================================\n");

		}

		session1.getTransaction().commit();

		session1.close();

	}
}

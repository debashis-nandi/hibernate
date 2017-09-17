package com.global.hb;

import java.util.List;
import org.hibernate.*;
import org.hibernate.cfg.*;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        try {
            Session session = HibernateUtil.getSession();

            AdminLogin admin = new AdminLogin();
            admin.setUserid("dessssssba2");
            admin.setPassword("pointwer2");

            session.beginTransaction();
            session.save(admin);
            session.getTransaction().commit();
            session.close();



        } catch (Exception ex) {
            System.out.print("--------------->>" + ex.getStackTrace());
        }
    }
}

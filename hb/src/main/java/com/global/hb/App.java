package com.global.hb;

import org.hibernate.*;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        try {
            Session session = HibernateUtil.getSession();


            AdminLogin admin = new AdminLogin();
            admin.setUserid("debashis nandi");
            admin.setPassword("maldanga-memari");

            session.beginTransaction();
            session.save(admin);
            session.getTransaction().commit();
            
            System.out.print("Record has been submitted."  );

            session.close();



        } catch (HibernateException  ex) {
            System.out.print("--------------->>" + ex.getMessage());
        }
    }
}

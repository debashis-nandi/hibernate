package com.global.hb;

import java.io.File;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

    private static final SessionFactory concreteSessionFactory;

    static {
        try {
            String hibernatePropsFilePath = "C:\\Users\\Japan\\Desktop\\hb-git\\hb\\src\\main\\resources\\hibernate.cfg.xml";
            File hibernatePropsFile = new File(hibernatePropsFilePath);

            concreteSessionFactory = new AnnotationConfiguration()
                    .configure(hibernatePropsFile)
                    .buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession()
            throws HibernateException {
        return concreteSessionFactory.openSession();
    }

}

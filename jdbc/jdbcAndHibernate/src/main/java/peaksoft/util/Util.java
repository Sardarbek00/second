package peaksoft.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {
    // реализуйте настройку соеденения с БД
    public static SessionFactory getSessionFactory() {
        SessionFactory sessionFactory = null;
try{
    sessionFactory=new Configuration().configure("hibernate.cfg.xml")
            .buildSessionFactory();
}catch (HibernateException e){
System.out.println("Error in getSessionFactory method");
}return sessionFactory;
    }
}

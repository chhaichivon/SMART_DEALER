package com.smartdealer.core.utils;

import com.smartdealer.core.models.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/4/2017
 * TIME   : 7:45 PM
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();
    // hibernate.cfg.xml
    /*private static SessionFactory buildSessionFactory(){
		try{
			Configuration configuration = new Configuration();
			return configuration
					.buildSessionFactory(new StandardServiceRegistryBuilder()
							.applySettings(configuration.getProperties())
							.build());
		}catch(Exception ex){
			ex.printStackTrace();
			throw new RuntimeException("There was an error building the factory.");
		}
	}*/
    // hibernate.properties
    private static SessionFactory buildSessionFactory(){
        try{
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(User.class);

            //configuration.addPackage("com.smartdealer.core.models");
            return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());
        }catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException("There was an error building the factory.");
        }
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
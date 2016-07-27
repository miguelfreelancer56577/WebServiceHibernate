/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mangelt.movies.manager.utileria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author SPPDF
 */
public class Conexion {
    
    public static final Session session(){
        SessionFactory sessionFactory = null;
        Configuration config = new Configuration().configure();
         // Build a Registry with our configuration properties
         ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
         config.getProperties()).build();

        sessionFactory = config.buildSessionFactory(serviceRegistry);
        return sessionFactory.openSession();
    }
    
}

package com.deloitte;




import javax.transaction.Transaction;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
public class HibernateUtil {

              private static final Log log = LogFactory.getLog(HibernateUtil.class);
              
             private static final SessionFactory sessionFactory=buildSessionFactory();
              
              private Session currentSession;
              
              private static org.hibernate.Transaction currentTransaction;
             
              @SuppressWarnings("deprecation")
              public static SessionFactory buildSessionFactory() {
                             try {
                            	// Create configuration instance
                             	
                            	 Configuration conf = new Configuration()
                                         .configure();


                               ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();


                               SessionFactory sf = conf.buildSessionFactory(sr);

                             	 //Return the session factory object
                             	 return sf;
                             
                            	 
                            	 
                            	 
                             } catch (Throwable ex) {
                                           // Make sure you log the exception, as it might be swallowed
                                           log.error("Initial SessionFactory creation failed." + ex);
                                           throw new ExceptionInInitializerError(ex);
                             }
              }

              public static SessionFactory getSessionFactory() {
                             return sessionFactory;
              }

              public static void shutdown() {
                             // Close caches and connection pools
                             getSessionFactory().close();
              }
              
              public static Session getSession() {
                             Session hiberSession = sessionFactory.getCurrentSession();
                             return hiberSession;
              }
              
              public static void closeSession() {
                             HibernateUtil.getSession().close();
              }
              public Session openCurrentSession() {
                  currentSession = getSessionFactory().openSession();
                  return currentSession;
              }
              public void setCurrentSession(Session currentSession) {
                  this.currentSession = currentSession;
              }
              public static Session beginTransaction() {
                  Session hiberSession = HibernateUtil.getSession();
                 hiberSession.beginTransaction();
                  return hiberSession;
   }
 
              
              
             
              public static void commitTransaction() {
                             HibernateUtil.getSession().getTransaction().commit();
              }
              
           
              
              public  Session openCurrentSessionwithTransaction() {
                  currentSession = getSessionFactory().openSession();
                  currentTransaction = currentSession.beginTransaction();
                  return currentSession;
              }
              public void closeCurrentSessionwithTransaction() {
                  currentTransaction.commit();
                  currentSession.close();
              }
              
              
              public static void rollbackTransaction() {
                             HibernateUtil.getSession().getTransaction().rollback();
              }
              
              public static boolean isTransactionActive() {
                             return HibernateUtil.getSession().getTransaction().isActive();
              }
             

}



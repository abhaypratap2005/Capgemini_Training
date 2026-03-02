package com.galgotia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerFactoryConnectionMain {

    private static EntityManagerFactory emf = null;
    private static EntityManager em = null;

    public static EntityManagerFactory getEntityManagerFactory() {
        if (emf == null || !emf.isOpen()) {
            emf = Persistence.createEntityManagerFactory("company_db_pu");
        }
        return emf;
    }

    public static EntityManager getEntityManger() {
        if (emf == null)
            getEntityManagerFactory();

        if (em == null || !em.isOpen())
            em = emf.createEntityManager();

        return em;
    }
}
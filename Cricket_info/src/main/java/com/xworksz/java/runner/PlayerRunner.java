package com.xworksz.java.runner;

import com.xworksz.java.entity.PlayerEntity;

import javax.persistence.*;
import java.awt.*;

public class PlayerRunner {
    public static void main(String[] args) {
        PlayerEntity entity = new PlayerEntity();

        entity.setLocation("delihi");
        entity.setJerserynum(12);
        entity.setCountry("India");
        entity.setIplteam("v");
        entity.setScore(21);
        entity.setAge(18);
        entity.setDob("tweentu");
        entity.setYear(2023);





        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myname");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            PlayerEntity pn=em.find(PlayerEntity.class,1);
            System.out.println(pn);
            et.begin();
            em.persist(entity);
            System.out.println("data saved");
            et.commit();

        } catch (PersistenceException e) {
            et.rollback();

        } finally {
            emf.close();
            em.close();
        }
    }
}


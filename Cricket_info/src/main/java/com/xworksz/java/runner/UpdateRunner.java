package com.xworksz.java.runner;

import com.xworksz.java.entity.PlayerEntity;

import javax.persistence.*;

public class UpdateRunner {
    public static void main(String[] args) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("myname");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();

        try{
            PlayerEntity  pt=em.find(PlayerEntity.class,1);
            System.out.println(pt);

            if(pt!=null){

                pt.setLocation("kerala");
                pt.setJerserynum(12);
                pt.setCountry("India");
                pt.setIplteam("v");
                pt.setScore(21);
                pt.setAge(18);
                pt.setDob("tweentu");
                pt.setYear(2023);

                PlayerEntity update=em.merge(pt);
                System.out.println(update);
                et.begin();
                et.commit();


            }else{
                System.out.println("notupdated");
            }

        }catch (PersistenceException e){
              et.rollback();
        }finally {
em.close();
 emf.close();
        }
    }
}

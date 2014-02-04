/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.praticasolucoes.exemplo.jpa.hibernate.testes;

import com.praticasolucoes.exemplo.jpa.hibernate.modelo.Editora;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author edney
 */
public class GeraTabelas {
    public static void gera() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("exemplo-jpa-hibernate");
        EntityManager manager  = factory.createEntityManager();
        
        Editora novaEditora = new Editora();
        novaEditora.setNome("Apply Solutions");
        novaEditora.setEmail("edney.chantal@gmail.com");
        manager.getTransaction().begin();
        manager.persist(novaEditora);
        manager.flush();
        manager.getTransaction().commit();
        manager.close();
        
        
        factory.close();
    }
    
    
}

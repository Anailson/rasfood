package com.food.restaurante.service;

import com.food.restaurante.entity.Prato;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.math.BigDecimal;

public class PratoService {

    public static void main(String[] args) {

        Prato risoto = new Prato();
        risoto.setNome("Risoto de frutos do mar");
        risoto.setDescricao("Risoto com lula, polvo e mariscos");
        risoto.setDisponivel(true);
        risoto.setValor(BigDecimal.valueOf(88.50));

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("resFood");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(risoto);
        entityManager.getTransaction().commit();
        entityManager.close();

    }
}

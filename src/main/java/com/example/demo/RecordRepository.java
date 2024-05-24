package com.example.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

public class RecordRepository {
    @PersistenceContext
    private EntityManager em;

    public List<Record> findAll() {
        TypedQuery<Record> query = em.createQuery("SELECT r FROM Record r", Record.class);
        return query.getResultList();
    }
}
package com.example.database_spring.dao;

import com.example.database_spring.entity.SinhVien;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class SinhVienDAOimpl implements SinhVienDAO{

    private EntityManager entityManager;
    @Autowired
    public SinhVienDAOimpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(SinhVien sv) {
        this.entityManager.merge(sv);
    }

    @Override
    public SinhVien findSV(int id) {
        return this.entityManager.find(SinhVien.class, id);
    }
}

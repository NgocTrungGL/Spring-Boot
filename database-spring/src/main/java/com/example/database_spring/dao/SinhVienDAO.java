package com.example.database_spring.dao;

import com.example.database_spring.entity.SinhVien;

public interface SinhVienDAO {
    public void save(SinhVien sv);
    public SinhVien findSV(int id);
}

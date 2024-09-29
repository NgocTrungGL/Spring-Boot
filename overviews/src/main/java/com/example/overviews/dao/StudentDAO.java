package com.example.overviews.dao;

import com.example.overviews.entity.Student;

import java.util.List;

public interface StudentDAO {
    public List<Student> findAll();
    public Student getSinhVienbyId(int id);
    public Student save(Student student);
    public Student saveAndFlush(Student student);
    public void deleteById(int id);
}

package com.example.overviews.service;

import com.example.overviews.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllSinhVien();
    public Student getSVbyID(int id);
    public Student addSV(Student student);
    public Student upSV(Student student);
    public void deleteSV(int id);

}

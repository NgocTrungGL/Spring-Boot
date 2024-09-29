package com.example.overviews.service;

import com.example.overviews.dao.StudentDAO;
import com.example.overviews.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    private StudentDAO studentDAO;

    public StudentServiceImpl(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Autowired

    @Override
    public List<Student> getAllSinhVien() {
        return this.studentDAO.findAll();
    }

    @Override
    public Student getSVbyID(int id) {
        return studentDAO.getSinhVienbyId(id);
    }

    @Override
    @Transactional
    public Student addSV(Student student) {
        return studentDAO.save(student);
    }

    @Override
    @Transactional
    public Student upSV(Student student) {
        return studentDAO.saveAndFlush(student);
    }

    @Override
    @Transactional
    public void deleteSV(int id) {
        studentDAO.deleteById(id);
    }
}

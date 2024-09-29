package com.example.overviews.rest;

import com.example.overviews.dao.StudentDAO;
import com.example.overviews.entity.Student;
import com.example.overviews.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping()
    public List<Student> getAll()
    {
        return studentService.getAllSinhVien();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Student> getSVid(@PathVariable int id)
    {
        Student sv = studentService.getSVbyID(id);
        if(sv != null)
        {
             return ResponseEntity.ok(sv);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<Student> addSV(@RequestBody Student student)
    {
        student.setId(0);
        student = studentService.addSV(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(student);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Student> upSV(@PathVariable int id, @RequestBody Student student)
    {
        Student sv = studentService.getSVbyID(id);
        if (sv != null)
        {
            sv.setHo_dem(student.getHo_dem());
            sv.setTen(student.getTen());
            sv.setEmail(student.getEmail());
            studentService.upSV(sv);
            return ResponseEntity.ok(sv);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
}

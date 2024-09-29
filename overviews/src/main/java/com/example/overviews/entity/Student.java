package com.example.overviews.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "sinhvien")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "ho_dem", length = 45)
    private String ho_dem;
    @Column(name = "ten", length = 45)
    private String ten;
    @Column(name = "email", length = 45)
    private String email;

    public Student() {
    }

    public Student(int id, String ho_dem, String ten, String email) {
        this.id = id;
        this.ho_dem = ho_dem;
        this.ten = ten;
        this.email = email;
    }

    public Student(String ho_dem, String ten, String email) {
        this.ho_dem = ho_dem;
        this.ten = ten;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHo_dem() {
        return ho_dem;
    }

    public void setHo_dem(String ho_dem) {
        this.ho_dem = ho_dem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

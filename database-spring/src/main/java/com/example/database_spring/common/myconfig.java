package com.example.database_spring.common;

import com.example.database_spring.dao.SinhVienDAOimpl;
import com.example.database_spring.entity.SinhVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class myconfig {

    @Bean
    @Autowired
    public CommandLineRunner getRunner(SinhVienDAOimpl sinhVienDAOImpl){
        return runner -> {
            Scanner scanner = new Scanner(System.in);
            while(true){
                inMenu();
                int luaChon = scanner.nextInt();
                scanner.nextLine();
                if(luaChon==1){
                    // Gọi phương thức thêm sinh viên
                    themSinhVien(sinhVienDAOImpl);
                }
                else if(luaChon==2)
                {
                    findSinhvien(sinhVienDAOImpl);
                }
            }
        };
    }
    private void findSinhvien(SinhVienDAOimpl sinhVienDAOImpl)
    {
        Scanner scanner = new Scanner(System.in);
        // Lấy thông tin sinh viên
        System.out.println("Nhập ma id: ");
        int id = scanner.nextInt();
        SinhVien sv = sinhVienDAOImpl.findSV(id);
        if(sv != null)
        {
            System.out.println(sv.toString());
        }
        else {
            System.out.println("NULL");
        }
    }
    public void inMenu(){
        System.out.println("============================================\n");
        System.out.println("MENU:\n"+
                "1. Thêm sinh viên\n"+
                "2. Tìm sinh viên\n"+
                "3. Xóa sinh viên\n"+
                "Lựa chọn: \n"
        );
    }


    public void themSinhVien(SinhVienDAOimpl sinhVienDAOImpl){
        Scanner scanner = new Scanner(System.in);
        // Lấy thông tin sinh viên
        System.out.println("Nhập họ đệm: ");
        String ho_dem = scanner.nextLine();
        System.out.println("Nhập tên: ");
        String ten = scanner.nextLine();
        System.out.println("Nhập email: ");
        String email = scanner.nextLine();
        SinhVien sinhVien = new SinhVien(ho_dem, ten, email);
        // Luu xuong CSDL
        sinhVienDAOImpl.save(sinhVien);
    }
}

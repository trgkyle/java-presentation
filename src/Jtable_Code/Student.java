/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jtable_Lab;

import java.util.*;
/**
 *
 * @author quang
 */


public class Student {
    private String maSv;
    private String hoten;
    private String gioiTinh;
    private int daiSo;
    private int kinhTe;
    private int trietHoc;
    
    public Student() {
        
    }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien : ");
        String code = sc.nextLine();
        System.out.println("Nhap ho ten sinh vien : ");
        String name = sc.nextLine();
        System.out.println("Nhap gioi tinh sinh vien : ");
        String gen = sc.nextLine();
        System.out.println("Nhap diem dai so : ");
        int daiSo = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Nhap diem kinh te : ");
        int kinhTe = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Nhap diem triet hoc : ");
        int trietHoc = sc.nextInt();
        sc.nextLine();
        
        this.maSv = code;
        this.hoten = name;
        this.gioiTinh = gen;
        this.daiSo = daiSo;
        this.kinhTe = kinhTe;
        this.trietHoc = trietHoc;
//        int age = sc.nextInt();
//        sc.nextLine();
//        a.setName(name);
//        a.setAge(age);
//        t.add(a); 
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDaiSo(int daiSo) {
        this.daiSo = daiSo;
    }

    public void setKinhTe(int kinhTe) {
        this.kinhTe = kinhTe;
    }

    public void setTrietHoc(int trietHoc) {
        this.trietHoc = trietHoc;
    }

    public String getHoten() {
        return hoten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public int getDaiSo() {
        return daiSo;
    }

    public int getKinhTe() {
        return kinhTe;
    }

    public int getTrietHoc() {
        return trietHoc;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jtable_Layout;

import Jtable_Code.*;
import java.util.*;
/**
 *
 * @author quang
 */


public class Student {
    private String maSv;
    private String hoten;
    private String gioiTinh;
    private String daiSo;
    private String kinhTe;
    private String trietHoc;
    
    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien : ");
        String code = sc.nextLine();
        
        System.out.println("Nhap ho ten sinh vien : ");
        String name = sc.nextLine();
        
        System.out.println("Nhap gioi tinh sinh vien : ");
        String gen = sc.nextLine();
        
        System.out.println("Nhap diem dai so : ");
        String daiSo = sc.nextLine();
        
        System.out.println("Nhap diem kinh te : ");
        String kinhTe = sc.nextLine();
        
        System.out.println("Nhap diem triet hoc : ");
        String trietHoc = sc.nextLine();
        
        this.maSv = code;
        this.hoten = name;
        this.gioiTinh = gen;
        this.daiSo = daiSo;
        this.kinhTe = kinhTe;
        this.trietHoc = trietHoc;
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

    public void setDaiSo(String daiSo) {
        this.daiSo = daiSo;
    }

    public void setKinhTe(String kinhTe) {
        this.kinhTe = kinhTe;
    }

    public void setTrietHoc(String trietHoc) {
        this.trietHoc = trietHoc;
    }

    public String getHoten() {
        return hoten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDaiSo() {
        return daiSo;
    }

    public String getKinhTe() {
        return kinhTe;
    }

    public String getTrietHoc() {
        return trietHoc;
    }
    
    public Vector<String> toVector(){
        Vector<String> t = new Vector<String>();
        t.add(this.maSv);
        t.add(this.hoten);
        t.add(this.gioiTinh);
        t.add(this.daiSo);
        t.add(this.kinhTe);
        t.add(this.trietHoc);
        return t;
    }
    
    public ArrayList<String> toArrayList(){
        ArrayList<String> t = new ArrayList<String>();
        t.add(this.maSv);
        t.add(this.hoten);
        t.add(this.gioiTinh);
        t.add(this.daiSo);
        t.add(this.kinhTe);
        t.add(this.trietHoc);
        return t;
    }
}

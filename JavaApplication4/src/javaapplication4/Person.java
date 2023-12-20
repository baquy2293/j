/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author abc
 */
public class Person {

    protected String HoTen;
    protected String ngaysinh;
    protected String diachi;
    protected String gioitinh;

    public Person() {
    }

    public Person(String HoTen, String ngaysinh, String daichi, String gioitinh) {
        this.HoTen = HoTen;
        this.ngaysinh = ngaysinh;
        this.diachi = daichi;
        this.gioitinh = gioitinh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDaichi() {
        return diachi;
    }

    public void setDaichi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return  HoTen + "$" + ngaysinh + "$" + diachi + "$" + gioitinh ;
    }
    
    public void nhap() {
        System.out.println("Nhap Ho ten:");
        Scanner sc = new Scanner(System.in);
        HoTen = sc.nextLine();
        System.out.println("Nhap Ngay Sinh: ");
        ngaysinh = sc.nextLine();
        System.out.println("Nhap Gioi Tinh;");
        gioitinh = sc.nextLine();
        System.out.println("Nhap Dia Chi:");
        diachi = sc.nextLine();
    }

    public void xuat() {
        System.out.println(this);
    }

}

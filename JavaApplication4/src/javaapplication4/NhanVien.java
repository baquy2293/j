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
public class NhanVien extends Person {

    static Scanner sc = new Scanner(System.in);
    String Phongban;
    double HeSoLuong;
    double ThamNien;
    double LuongCoBan;
    double LuongthucLinh = LuongCoBan * HeSoLuong * (1 + ThamNien / 100);

    public NhanVien() {
    }

    public NhanVien(String ht, String ns, String dc, String gt, String Phongban, double HeSoLuong, double ThamNien, double LuongCoBan) {
        super(ht, ns, dc, gt);
        this.Phongban = Phongban;
        this.HeSoLuong = HeSoLuong;
        this.ThamNien = ThamNien;
        this.LuongCoBan = LuongCoBan;
    }

    public void nhap() {
        super.nhap();
        System.out.println("Nhap Phong ban: ");
        Phongban = sc.nextLine();
        System.out.println("Nhap He So Luong:");
        HeSoLuong = sc.nextDouble();
        System.out.println("Nhap Tham Nien: ");
        ThamNien = sc.nextDouble();
        System.out.println("Nhap Luong Co Ban: ");
        LuongCoBan = sc.nextDouble();

    }

   
 public String save() {
        return toString() + Phongban + "$" + HeSoLuong + "$" + ThamNien + "$" + LuongCoBan + "$" + LuongthucLinh;

    }

    public void xuat() {
        super.xuat();
        System.out.println(this);
    }

}

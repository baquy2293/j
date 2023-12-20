/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author abc
 */
public class TskhoiA extends Thisinh{
    private double toan,li,hoa;

    public TskhoiA() {
    }

    public TskhoiA(double toan, double li, double hoa, String ht, String dc, Date ngaysinh) {
        super(ht, dc, ngaysinh);
        this.toan = toan;
        this.li = li;
        this.hoa = hoa;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLi() {
        return li;
    }

    public void setLi(double li) {
        this.li = li;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        Thisinh.scanner = scanner;
    }

    @Override
    public String toString() {
        return super.toString()+ "toan=" + toan + ", li=" + li + ", hoa=" + hoa ;
    }
    
    public void show(){
        System.out.println(this);
    }
    public void nhap() throws ParseException{
        super.nhap();
        System.out.println("Nhap diem toan");
        this.toan = scanner.nextDouble();
        System.out.println("Nhap diem li");
        this.li = scanner.nextDouble();
        System.out.println("Nhap diem hoa");
        this.hoa = scanner.nextDouble();
        scanner.next();
    }
    
    
    public double tong(){
        return this.li+this.hoa+this.toan;
    }
    
}

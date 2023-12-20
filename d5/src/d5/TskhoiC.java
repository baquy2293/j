/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d5;

import static d5.Thisinh.scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author abc
 */
public class TskhoiC extends Thisinh{
    private double van,su,dia;

    public TskhoiC() {
    }

    public TskhoiC(double van, double su, double dia, String ht, String dc, Date ngaysinh) {
        super(ht, dc, ngaysinh);
        this.van = van;
        this.su = su;
        this.dia = dia;
    }

    public double getVan() {
        return van;
    }

    public void setVan(double van) {
        this.van = van;
    }

    public double getSu() {
        return su;
    }

    public void setSu(double su) {
        this.su = su;
    }

    public double getDia() {
        return dia;
    }

    public void setDia(double dia) {
        this.dia = dia;
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
        return super.toString()+ "van=" + van + ", su=" + su + ", dia=" + dia + '}';
    }
    
      public void show(){
        System.out.println(this);
    }
    public void nhap() throws ParseException{
        super.nhap();
        System.out.println("Nhap diem van");
        this.van = scanner.nextDouble();
        System.out.println("Nhap diem xu");
        this.su = scanner.nextDouble();
        System.out.println("Nhap diem dia");
        this.dia = scanner.nextDouble();
        scanner.next();
    }
      public double tong(){
        return this.van+this.su+this.dia;
    }
    
    
}

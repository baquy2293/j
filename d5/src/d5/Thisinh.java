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
public class Thisinh {
    private String ht,dc;
    Date ngaysinh;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
    static  Scanner scanner = new Scanner(System.in);

    public Thisinh() {
    }

    public Thisinh(String ht, String dc, Date ngaysinh) {
        this.ht = ht;
        this.dc = dc;
        this.ngaysinh = ngaysinh;
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    

    @Override
    public String toString() {
        return "ht=" + ht + ", dc=" + dc + ", ngaysinh=" + sdf.format(ngaysinh) ;
    }
    
    
    public void show(){
        System.out.println(this);
    }
    
    public  void nhap() throws ParseException{
        boolean test = true;
        while (test) {
             System.out.println("Nhap Ho ten");
             this.ht = scanner.next();
        System.out.println("Nhap ngay sinh");
            try {
                 this.ngaysinh = sdf.parse(scanner.next());
                 test = false;
            } catch (Exception e) {
            }
        System.out.println("Nhap dia chi");
        this.dc = scanner.next(); 
        }
    }
   
    
    
    
}

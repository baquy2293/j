/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d1;

import java.util.Date;

/**
 *
 * @author abc
 */
public class Student extends Person{
    private String masv;
    private String email;
    private double diem;

    public Student() {
    }

    public Student(String masv, String email, double diem, String hoten, Date ngaysinh, String diachi, String gt) {
        super(hoten, ngaysinh, diachi, gt);
        this.masv = masv;
        this.email = email;
        this.diem = diem;
    }

   
    @Override
    public String toString() {
       
        return super.toString()+"masv=" + masv + ", email=" + email + ", diem=" + diem;
    }
        
    public void show(){
        System.out.println(this.toString());
    }
    
}

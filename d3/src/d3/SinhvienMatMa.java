/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d3;

import java.util.Date;

/**
 *
 * @author abc
 */
public class SinhvienMatMa extends Sinhvien{
    private String donvi;
    private double luong;

    public SinhvienMatMa() {
    }
    

    public SinhvienMatMa(String donvi, double luong, String masv, String ht, String gt, Date ns, double diem) {
        super(masv, ht, gt, ns, diem);
        this.donvi = donvi;
        this.luong = luong;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return super.toString()+" donvi=" + donvi + ", luong=" + luong + '}';
    }
    
    
    
}

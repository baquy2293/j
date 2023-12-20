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
public class Sinhvien {
    private String masv,ht,gt;
    private Date ns;
    private double diem;

    public Sinhvien() {
    }

    public Sinhvien(String masv, String ht, String gt, Date ns, double diem) {
        this.masv = masv;
        this.ht = ht;
        this.gt = gt;
        this.ns = ns;
        this.diem = diem;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public Date getNs() {
        return ns;
    }

    public void setNs(Date ns) {
        this.ns = ns;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "masv=" + masv + ", ht=" + ht + ", gt=" + gt + ", ns=" + ns + ", diem=" + diem ;
    }
    
    
}

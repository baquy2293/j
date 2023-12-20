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
public class SinhvienATTT extends Sinhvien{
    private double hocphi;

    public SinhvienATTT() {
    }

    public SinhvienATTT(double hocphi, String masv, String ht, String gt, Date ns, double diem) {
        super(masv, ht, gt, ns, diem);
        this.hocphi = hocphi;
    }

    public double getHocphi() {
        return hocphi;
    }

    public void setHocphi(double hocphi) {
        this.hocphi = hocphi;
    }

    @Override
    public String toString() {
        return  super.toString()+" hocphi=" + hocphi  + '}';
    }
    
    
}

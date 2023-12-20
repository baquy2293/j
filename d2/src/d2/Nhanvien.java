/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d2;

import java.util.Date;

/**
 *
 * @author abc
 */
public class Nhanvien extends Person{
    private String pb;
    private double hsl;
    private double tn;
    private double lcb;
    private double ltl;

    public Nhanvien() {
    }
    public Nhanvien(String pb, double hsl, double tn, double lcb, String ht, Date ns, String dc, String gt) {
        super(ht, ns, dc, gt);
        this.pb = pb;
        this.hsl = hsl;
        this.tn = tn;
        this.lcb = lcb;
        this.ltl = this.lcb*(1+this.tn/100);
    }

    public String getPb() {
        return pb;
    }

    public double getHsl() {
        return hsl;
    }

    public double getTn() {
        return tn;
    }

    public double getLcb() {
        return lcb;
    }

    
    public double getLtl() {
        return ltl = this.lcb*(1+this.tn/100);
    }
    
    @Override
    public String toString() {
        return  "$" + pb + "$" + hsl + "$" + tn + "$" + lcb + "$" + ltl;
    }
    
    
    
    
    
    
    
}

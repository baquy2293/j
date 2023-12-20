/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d7;

/**
 *
 * @author abc
 */
public class Nhanvien {
    private int id;
    private String hoten;

    public Nhanvien() {
    }

    public Nhanvien(int id, String hoten) {
        this.id = id;
        this.hoten = hoten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    @Override
    public String toString() {
        return  "id=" + id + ", hoten=" + hoten+", ";
    }
    
    
}

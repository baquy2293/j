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
public class Giangvien extends Nhanvien{
    private String magv,diachi,gioitinh,khoa;

    public Giangvien() {
    }

    public Giangvien(String magv, String diachi, String gioitinh, String khoa, int id, String hoten) {
        super(id, hoten);
        this.magv = magv;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.khoa = khoa;
    }

    public String getMagv() {
        return magv;
    }

    public void setMagv(String magv) {
        this.magv = magv;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    @Override
    public String toString() {
        return "Giangvien{" +super.toString() + "magv=" + magv + ", diachi=" + diachi + ", gioitinh=" + gioitinh + ", khoa=" + khoa + '}';
    }
    
    
}

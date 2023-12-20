/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import fream.inputData;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author abc
 */
public class NhanVienList {

    ArrayList<NhanVien> nv;

    public NhanVienList() {
        this.nv = new ArrayList<>();
    }

    public void clear() {
        nv.clear();
    }

    public void saveFile(String filePath) throws IOException {
        File file = new File(filePath);
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);
        for (NhanVien nhanVien : nv) {
            br.write(nhanVien.save() + "\n");

        }
        br.close();
        fr.close();
    }

    public void getFile(String filePath) throws IOException {
        File f = new File(filePath);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        nv.clear();
        String str;
        while ((str = br.readLine()) != null) {
            String[] obj = str.split("\\$");
            String HoTen = obj[0];
            String ngaysinh = obj[1];
            String diachi = obj[2];
            String gioitinh = obj[3];
            String Phongban = obj[4];
            double HeSoLuong = Double.parseDouble(obj[5]);
            double ThamNien = Double.parseDouble(obj[6]);
            double LuongCoBan = Double.parseDouble(obj[7]);
            double LuongthucLinh = Double.parseDouble(obj[8]);
            nv.add(new NhanVien(HoTen, ngaysinh, diachi, gioitinh, Phongban, HeSoLuong, ThamNien, LuongCoBan));
        }
        br.close();
        fr.close();
    }

    @Override
    public String toString() {
        String str = "";
        for (NhanVien x : nv) {
            str += x.toString() + "\n";
        }
        return str;
    }

    public void add(NhanVien tmp) {
        this.nv.add(tmp);
    }

}

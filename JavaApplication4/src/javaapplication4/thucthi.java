/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import fream.inputData;
import java.util.ArrayList;

/**
 *
 * @author abc
 */
public class thucthi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   String t= "Giangvien{id=3, hoten=2, magv=2, diachi=2, gioitinh=nam, khoa=2}";
   int id = 2;
   String tmp = "magv="+id+"";
        System.out.println(tmp);
        System.out.println(t.contains(tmp));
    
}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author abc
 */
public class Person {
    private String hoten;
    private Date ngaysinh;
    private String diachi;
    private String gt;

    public Person() {
    }

    public Person(String hoten, Date ngaysinh, String diachi, String gt) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.gt = gt;
    }

    @Override
    public String toString() {
        SimpleDateFormat sp =new SimpleDateFormat("dd/MM/yyyy");
        return  "hoten=" + hoten + ", ngaysinh=" + sp.format(ngaysinh) + ", diachi=" + diachi + ", gt=" + gt+ ", ";
    }

   

  
    
    
   
    
    
}

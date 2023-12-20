/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d5;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author abc
 */
public class D5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thi sinh");
        ArrayList<Thisinh> thisinhs = new ArrayList<>();
        int number = 0;
        while (true) {
            try {
                number = Integer.parseInt(scanner.next());
                break;
            } catch (Exception e) {
                System.out.println("Nhap sai dinh dang");
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.println("Nhap Thi sinh khoi");
            String khoi = scanner.next();
            if (khoi.contains("a") || khoi.contains("A")) {
                TskhoiA a = new TskhoiA();
                a.nhap();
                thisinhs.add(a);
            } else if (khoi.contains("c") || khoi.contains("C")) {
                TskhoiC c = new TskhoiC();
                c.nhap();
                thisinhs.add(c);
            } else {
                i--;
                System.out.println("Nhap chi co khoi A hoac C");
            }
        }

        for (Thisinh thisinh : thisinhs) {
            if (thisinh instanceof TskhoiA) {
                if (((TskhoiA) thisinh).tong() > 20) {
                    thisinh.show();
                }

            } else if (thisinh instanceof TskhoiC) {
                if (((TskhoiC) thisinh).tong() > 20) {
                    thisinh.show();
                }

            }
        }

    }

}

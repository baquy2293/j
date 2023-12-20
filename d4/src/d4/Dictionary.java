/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d4;

import java.util.ArrayList;

/**
 *
 * @author abc
 */
public class Dictionary {

    ArrayList<Word> tuDien = new ArrayList<>();

    public Dictionary() {
        tuDien.add(new Word(1, "dog", "cho"));
        tuDien.add(new Word(2, "cat", "meo"));
        tuDien.add(new Word(3, "bird", "chim"));
        tuDien.add(new Word(4, "hotdog", "xuc xich"));
        tuDien.add(new Word(5, "go", "di"));
        tuDien.add(new Word(6, "apple", "tao"));
        tuDien.add(new Word(7, "orange", "cam"));
        tuDien.add(new Word(8, "banana", "chuoi"));
        tuDien.add(new Word(9, "word", "tu"));
        tuDien.add(new Word(10, "hello", "xin chao"));
        sapXep();
    }
    public void them(String en,String vn){
        int id=tuDien.size()+1;
        tuDien.add(new Word(id, en, vn));
        System.out.println(tuDien.get(id-1).toString());
        System.out.println(tuDien.size());
        sapXep();
        
    }
    
    
    

    public void sapXep() {

        for (int i = 0; i < this.tuDien.size() - 1; i++) {
            for (int j = i + 1; j < this.tuDien.size(); j++) {
                if (this.tuDien.get(i).getEn().compareToIgnoreCase(this.tuDien.get(j).getEn()) > 0) {
                    Word tmpWord = this.tuDien.get(i);
                    this.tuDien.set(i, this.tuDien.get(j));
                    this.tuDien.set(j, tmpWord);
                }
            }
        }
    }

    public String timKiem(String en) {

        int ketQua = binarySearch(0, tuDien.size() - 1, en);
        if (ketQua != -1) {
            return tuDien.get(ketQua).getVn();
        }
        return "";
    }

    int binarySearch(int l, int r, String x) {
        if (r >= l) {
            int mid = l + (r - l) / 2; // Tương đương (l+r)/2 nhưng ưu điểm tránh tràn số khi l,r lớn

            // Nếu arr[mid] = x, trả về chỉ số và kết thúc.
            if (tuDien.get(mid).getEn().compareTo(x) == 0) {
                return mid;
            }

            // Nếu arr[mid] > x, thực hiện tìm kiếm nửa trái của mảng
            if (tuDien.get(mid).getEn().compareTo(x) > 0) {
                return binarySearch(l, mid - 1, x);
            }

            // Nếu arr[mid] < x, thực hiện tìm kiếm nửa phải của mảng
            return binarySearch(mid + 1, r, x);
        }

        // Nếu không tìm thấy
        return -1;
    }
    
    

}

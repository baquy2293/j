/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d6;

/**
 *
 * @author abc
 */
public class Book {
    String author,title,catrgory;
    int id;

    public Book() {
    }

    public Book(String author, String title, String catrgory, int id) {
        this.author = author;
        this.title = title;
        this.catrgory = catrgory;
        this.id = id;
    }

   

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" + "author=" + author + ", title=" + title + ", catrgory=" + catrgory + ", id=" + id + '}';
    }

   
    
    
}

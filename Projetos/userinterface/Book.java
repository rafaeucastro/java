/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userinterface;

/**
 *
 * @author Alunos
 */
public class Book {
    private final String title;
    private final String author;
    private final int year;
    private int edition;
    private final String publisher;
    private final int pages;

    public Book(String title, String author, int edition, int year, String publisher, int pages) {
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.year = year;
        this.publisher = publisher;
        this.pages = pages;
    }

    public String getTitle() {
        return this.title;
    }
    
    public String getAuthor() {
        return this.author;
    }
 
    public int getYear() {
        return this.year;
    }
    
    public String getPublisher() {
        return this.publisher;
    }

    public int getPages() {
        return pages;
    }

    public int getEdition() {
        return this.edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
}

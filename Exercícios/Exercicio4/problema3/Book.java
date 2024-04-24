/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema3;

/**
 *
 * @author Alunos
 */
public class Book {
    private final String title;
    private final String author;
    private final int year;
    private final int edition;
    private final String publisher;

    public Book(String title, String author, int year, int edition, String publisher) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.edition = edition;
        this.publisher = publisher;
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
    
    public int getEditor() {
        return this.edition;
    }
    
    public String getPublisher() {
        return this.publisher;
    }
}

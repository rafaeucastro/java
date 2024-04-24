/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema3;
import java.util.Date;

/**
 *
 * @author Alunos
 */
public class Loan {
    final Person person;
    final Book book;
    final Date loan_date;
    final Date return_date;

    public Loan(Person person, Book book, Date loan_date, Date return_date) {
        this.person = person;
        this.book = book;
        this.loan_date = loan_date;
        this.return_date = return_date;
    }
    
    public String getPersonName() {
        return this.person.getName();
    }
    
    public String getBookTitle() {
        return this.book.getTitle();
    }
    
    public Date getLoanDate() {
        return this.loan_date;
    }
    
    public Date getRetunDate() {
        return this.return_date;
    }
}

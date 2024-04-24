/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema3;

/**
 *
 * @author Alunos
 */
public class Person {
    private final String name;
    private final int cpf;
    private String email;
    private String adress;
    private int phone;

    public Person(String name, int cpf, String email, String adress, int phone) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.adress = adress;
        this.phone = phone;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getCpf() {
        return this.cpf;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getAdress() {
        return this.adress;
    }
    
    public int getPhone() {
        return this.phone;
    }
    
    public static void eia(){
        
    }
}

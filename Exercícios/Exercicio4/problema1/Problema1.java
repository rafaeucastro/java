/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.problema1;


/**
 *
 * @author Alunos
 */
public class Problema1 {
    

    public static void main(String[] args) {
        System.out.println("Problema 1");
        Circle circulo = new Circle(4.6);
        
        System.out.println("RAIO: "+circulo.getRadius());
        circulo.setRadius(2.5);
        System.out.println("NOVO RAIO: "+circulo.getRadius());
        System.out.println("Área: "+circulo.getArea());
        System.out.println("Circunferência: "+circulo.getCircunference());
        circulo.increaseRadius(50);
        System.out.println("NOVO RAIO: "+circulo.getRadius());
    }
}

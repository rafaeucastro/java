/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

/**
 *
 * @author Alunos
 */

package userinterface;

public class Retangulo extends Figura{
    private double lado1;
    private double lado2;
    
    public Retangulo() {
        
    }

    public Retangulo(double lado1, double lado2, String cor) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        setCor(cor);
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double area() {
        return lado1 * lado2;
    }

    @Override
    public String toString() {
        return "Retângulo\n" + "Lado 1: " + this.lado1 + "\nLado 2: " + this.lado2 + "\nÁrea: " + area();
    }
    
}

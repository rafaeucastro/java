/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package userinterface;

import java.text.MessageFormat;
/**
 *
 * @author Alunos
 */
public class Triângulo extends Figura {
    private double base;
    private double altura;

    public Triângulo(double base, double altura, String cor) {
        this.base = base;
        this.altura = altura;
        setCor(cor);
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double area() {
        return (base * altura)/2;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Triângulo\nBase: {0}\nAltura: {1}\nÁrea: {2}", base, altura, area());
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrata;

/**
 *
 * @author Alunos
 */
public class Circulo extends Figura {
    private double raio;
    private final double PI  = 3.1415;

    public Circulo(double raio, String cor) {
        this.raio = raio;
        setCor(cor);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    double area() {
        return PI * raio * raio;
    }
    
    double getDiametro() {
        return 2 * PI * raio;
    }

    @Override
    public String toString() {
        return "Círculo\n" + "Raio: " + raio + "\nÁrea: " + area() + "\nDiâmetro: " + getDiametro();
    }

}

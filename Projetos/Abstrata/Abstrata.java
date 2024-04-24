/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstrata;

/**
 *
 * @author Alunos
 */
public class Abstrata {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo(3, 4, "Ciano");
        Quadrado qua = new Quadrado(5, "Magenta");
        Circulo cir = new Circulo(2, "Marrom");
        Triângulo tri = new Triângulo(3, 6, "Violeta");
        
        qua.toString();
    }
}

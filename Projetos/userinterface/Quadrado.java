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
public class Quadrado extends Retangulo{
    
    public Quadrado(double lado, String cor) {
        setLado1(lado);
        setCor(cor);
    }
    
    @Override
    public double area() {
        return getLado1() * getLado1();
    }

    @Override
    public String toString() {
        return MessageFormat.format("Quadrado\nLado: {0}\nÁrea: {1}", getLado1(), area());
    }
}

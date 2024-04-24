/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Alunos
 */
public class Problema05 {

    public static void main(String[] args) {
       int[] p = new int[16];
       int Liu=0, Zhao=0;
       Scanner entrada = new Scanner(System.in);
       //Entrada dos dados
       for(int i=0; i<16; i++){
           p[i] = entrada.nextInt();
       }
       for(int i=0; i<16; i++){
           if(p[i]==1){
               Zhao = i;
           }
           if(p[i]==7){
               Liu=i;
           }
       }
        System.out.println("Posição de Zhao é " +(Zhao+1));
        System.out.println("Posição de Liu é " + (Liu+1));
        
        if((Zhao/8)==(Liu/8)){
            if((Zhao/4)==(Liu/4)){
                if((Zhao/2)==(Liu/2)){
                    System.out.println("Oitavas");
                }
                else{
                    System.out.println("Quartas");
                }
            }
            else{
                System.out.println("Semifinal");
            }
        }
        else{
            System.out.println("Final");
        }
    }
    
}

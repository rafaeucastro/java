package com.mycompany.problema2;

import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Produto produto = new Produto("Arroz");
  
        System.out.print("Digite o valor de custo: ");
        produto.setPrecoCusto(input.nextDouble());
        System.out.print("Digite o valor de venda: ");
        produto.setPrecoVenda(input.nextDouble());
        
        // Calcula a margem de lucro
        produto.calcularMargemLucro();
        
        // Exibe os resultados
        System.out.println("Preço de custo: " +produto.getPrecoCusto());
        System.out.println("Preço de venda: " +produto.getPrecoVenda());
        System.out.println("Margem de Lucro: " +produto.getMargemLucro());
        System.out.println("Margem de Lucro (%): " +produto.getMargemLucroPorcentagem());
        
    }
}

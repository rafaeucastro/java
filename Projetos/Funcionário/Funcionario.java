/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema01;

/**
 *
 * @author Alunos
 */
public class Funcionario {
    public String nome;
    private double salario = 1000;
    
    public void aumentoSalarial(double valor) {
        salario += valor;
    }

    public double getSalario() {
        return salario;
    }
    
    public double ganhoAnual() {
        return salario * 12;
    }
    
    public void exibeDados() {
        print("Nome: " + nome);
        print("Salário: " + salario);
        print("Ganho anual: " + ganhoAnual());
    }
    
    public void print(String conteúdo) {
        System.out.println(conteúdo);
    }
}

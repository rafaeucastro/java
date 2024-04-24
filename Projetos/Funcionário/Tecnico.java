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
public class Tecnico extends Assistente {
    private double bônusSalarial = 45.5;

    public Tecnico(String nome, int matrícula) {
        this.nome = nome;
        setMatrícula(matrícula);
    }

    @Override
    public double getSalario() {
        return super.getSalario() + bônusSalarial; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double ganhoAnual() {
        return getSalario() * 12;
    }

    @Override
    public void exibeDados() {
        print("Nome: " + nome);
        print("Salário: " + getSalario());
        print("Ganho anual: " + ganhoAnual());
        print("Matrícula: " + super.getMatrícula());
        print("");
    }
    
}

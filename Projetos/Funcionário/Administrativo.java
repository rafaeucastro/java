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

enum Turno {
    dia,
    noite,
}

public class Administrativo extends Assistente {
    private Turno turno;
    private final double adicionalNoturno = 150.5;

    public Administrativo(String nome, int matrícula, Turno turno) {
        this.nome = nome;
        setMatrícula(matrícula);
        this.turno = turno;
    }

    @Override
    public double getSalario() {
        if (turno == Turno.noite) {
            return super.getSalario() + adicionalNoturno;
        }
        return super.getSalario();
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
        print("Turno: " + turno);
        print("");
    }
}
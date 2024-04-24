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
public class Assistente extends Funcionario {
    private int matrícula;

    public int getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(int matrícula) {
        this.matrícula = matrícula;
    }
    
    @Override
    public void exibeDados() {
        super.exibeDados();
        print("Matrícula: " + matrícula);
    }
}

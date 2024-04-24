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
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario rafael = new Tecnico("Rafael", 456);
        Funcionario joão = new Administrativo("João", 444, Turno.dia);
        Funcionario maria = new Administrativo("Maria", 656, Turno.noite);
        
        rafael.exibeDados();
        joão.exibeDados();
        maria.exibeDados();
        
        System.out.println("> R$100 de aumento de salário para João");
        joão.aumentoSalarial(100);
        joão.exibeDados();
    }
    
}

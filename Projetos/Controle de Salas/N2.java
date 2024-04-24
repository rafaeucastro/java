/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package n2;

import java.util.List;

/**
 *
 * @author Alunos
 */
public class N2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Classroom> rooms;
        List<Subject> subjects;
        
        
    }
    
    void teste(){
        //Instanciação das classes para teste
        var lab = new Classroom(2, "Laboratório de Informática 1", 5);
        var bd = new Subject("Banco de dados", "123", "ADS",
                4, "Jamile", 'M', "Quarta",
                lab.getId(), "ABCD");
        
        //Manipulação de SALA DE AULA
        lab.setResponsible("Juvenildo");
        //lab.setStatus("Disponível");
        lab.setAsReserved();
        
        //Manipulação de DISCIPLINA
        bd.setShift('T');
        
        //System.out.println(lab.toString());
        System.out.println(bd.toString());
    }

}

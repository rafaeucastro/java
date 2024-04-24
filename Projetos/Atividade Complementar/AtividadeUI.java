/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Cla
sses/Interface.java to edit this template
 */
package atividade.complementar;

import java.util.Scanner;

/**
 *
 * @author Rafael de Sousa Castro
 * Aluno do Instituto Federeal do Ceará
 */
public interface AtividadeUI {
    MeusAlunos meusAlunos = new MeusAlunos();
    
        public static void interfaceComUsuário() {
            System.out.println("Sistema de gereciamento de atividades complementares");
            Scanner entrada = new Scanner(System.in);
            
            while(true) {
                System.out.println("\n1- Cadastrar aluno");
                System.out.println("2- Cadastrar atividade complementar");
                System.out.println("3- Pesquisar atividades complementares de um aluno");
                System.out.println("4- Alterar status de uma atividade complementar");
                System.out.println("5- Mostrar carga horária total de todos os alunos");
                System.out.println("6- Exibir a carga horária total das atividades complementares de um aluno");
                System.out.printf("O que você deseja fazer? ");
                String opção = entrada.next();
                
                switch (opção) {
                    case "1" -> {
                        System.out.printf("\nDigite o nome completo: ");
                        String nome = entrada.next();
                        System.out.printf("Matrícula: ");
                        int matrícula = entrada.nextInt();
                        System.out.printf("Curso: ");
                        String curso = entrada.next();
                        
                        meusAlunos.inserir(nome, matrícula, curso);
                    }
                    case "2" -> {
                        System.out.printf("\nDescrição da atividade: ");
                        String descrição = entrada.next();
                        System.out.printf("Grupo da atividade: ");
                        int grupo_atividade = entrada.nextInt();
                        System.out.printf("Matrícula do aluno: ");
                        int matrícula = entrada.nextInt();
                        
                        boolean êxito = meusAlunos.cadastrarAtividade(matrícula, grupo_atividade, descrição);
                        if(êxito){
                            System.out.println("\n Atividade cadastrada com sucesso!");
                        } else {
                            System.out.println("\n# Aluno não encontrado!");
                        }
                    }
                    case "3" -> {
                        System.out.printf("\nMatrícula do aluno: ");
                        int matrícula = entrada.nextInt();
                        
                        mostrarAtividades(matrícula);        
                    }
                    case "4" -> {
                        System.out.printf("\nMatrícula do aluno: ");
                        int matrícula = entrada.nextInt();
                        
                        Aluno aluno = meusAlunos.pesquisarPorMatrícula(matrícula);
                        if(aluno == null){
                            System.out.println("\n# Aluno não encontrado!");
                            break;
                        } else if(aluno.getAtividades().isEmpty()){
                            System.out.println("\n# Esse aluno ainda não possui nenhuma atividade cadastrada!");
                            break;
                        }
                        
                        System.out.printf("Número de registro da atividade: ");
                        int númeroAtividade = entrada.nextInt();
                        
                        if(aluno.getAtividades().size() <= númeroAtividade){
                            System.out.println("A atividade referente a esse código não existe!");
                            break;
                        }
                        
                        System.out.printf("Aproveitar atividade? (s, n): ");                       
                        String aproveita = entrada.next();
                        
                        if(aproveita.startsWith("s")){
                            System.out.printf("Carga horária considerada: ");
                            int cargaHoráriaConsiderada = entrada.nextInt();
             
                            meusAlunos.alterarStatusDeAproveitamento(númeroAtividade, true, cargaHoráriaConsiderada, aluno);
                            System.out.println("\nSucesso!");
                        } else if(aproveita.startsWith("n")) {
                            meusAlunos.alterarStatusDeAproveitamento(númeroAtividade, false, 0, aluno);
                        } else {
                            System.out.println("\n# Hm... não entendi!");
                            break;
                        } 
                    } 
                    case "5" -> {
                        exibirDadosDeTodosAlunos();
                    }
                    case "6" -> {
                        System.out.printf("\nMatrícula do aluno: ");
                        int matrícula = entrada.nextInt();
                        
                        Aluno aluno = meusAlunos.pesquisarPorMatrícula(matrícula);
                        if(aluno == null){
                            System.out.println("\n# Aluno não encontrado!");
                            break;
                        }
                        
                        exibirDadosDoAluno(aluno);
                    }
                    default -> {
                        System.out.println("\n# Ops... essa opção ainda não está disponível!");
                    }
                }
            }
        }
        
        private static void mostrarAtividades(int matrícula){
            final Aluno aluno = meusAlunos.pesquisarPorMatrícula(matrícula);
            
            if(aluno == null) {
                System.out.println("\n# Não encontramos o aluno solicitado!");
                return;
            } else if(aluno.getAtividades().isEmpty()) {
                System.out.println("\n# Esse aluno ainda não possui atividades complementares cadastradas!");
            }
            
            aluno.getAtividades().forEach((atividade) -> {
                System.out.println("\nNúmero do registro: " + atividade.getNúmeroRegistro());
                System.out.println("Grupo de atividade: " + atividade.getGrupoAtividade());
                System.out.println("Descriçãõ: " + atividade.getDescriçãoAtividade());
                System.out.println("Status de aproveitamento: " + atividade.getStatusAproveitamentoAsString());
                System.out.println("Carga horária considerada: " + atividade.getCargaHorariaConsiderada());
                System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - -");
            });
        }
        
        private static void exibirDadosDoAluno(Aluno aluno) {
            System.out.println("\nNome: " + aluno.getNome_completo());
            System.out.println("Matrícula: " + aluno.getCurso());
            System.out.println("Carga horária total: " + aluno.getCargaHorariaTotal());
            System.out.println("Número total de atividades: " + aluno.getQuantidadeAtividades());
            System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        }
        
        private static void exibirDadosDeTodosAlunos(){
            if(meusAlunos.getAlunos().isEmpty()) {
                System.out.println("\n# Nenhum aluno encontrado!");
                return;
            }
            
            meusAlunos.getAlunos().forEach((aluno) -> {
                exibirDadosDoAluno(aluno);
            });
        }
}

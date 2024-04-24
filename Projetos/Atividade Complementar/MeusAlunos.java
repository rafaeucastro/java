/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.complementar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael de Sousa Castro
 * Aluno do Instituto Federeal do Ceará
 */
public class MeusAlunos {
    private List<Aluno> alunos = new ArrayList<>();
    
    /**
     * Inserir um novo aluno na lista
     * @param nome_completo
     * @param matricula
     * @param curso 
     */
    public void inserir(String nome_completo, int matricula, String curso){
        final Aluno novo_aluno = new Aluno(nome_completo, matricula, curso);
        alunos.add(novo_aluno);
    }
    
    /**
     * 
     * @return uma cópia da lista de alunos
     */
    List<Aluno> getAlunos() {
        return this.alunos.subList(0, this.alunos.size());
    }
    
    /**
     * Pesquisar um aluno na lista usando a matrícula
     * @param matrícula
     * @return o aluno
     */
    public Aluno pesquisarPorMatrícula(int matrícula) {
        for (Aluno aluno : alunos) {
            if(aluno.getMatricula() == matrícula){
                return aluno;
            }
        }

        return null;
    }
    
    public int getIndexAluno(Aluno aluno){
        return alunos.indexOf(aluno);
    }
    
    /**
     * Cadastrar uma nova atividade
     * @param matricula
     * @param grupoAtividade
     * @param descrição
     * @return true se foi cadastrado com sucesso
     */
    public boolean cadastrarAtividade(int matricula, int grupoAtividade, String descrição) {
        final Aluno aluno = pesquisarPorMatrícula(matricula);
        if(aluno == null) {
            return false;
        }
        
        int índice_aluno = getIndexAluno(aluno);
        alunos.get(índice_aluno).inserirAtividade(grupoAtividade, descrição);
        return true;
    }
    
    /**
     * Encontra o índice de um aluno e altera o status do aproveitamento
     * @param númeroAtividade
     * @param statusAproveitamento
     * @param cargaHorariaConsiderada
     * @param aluno 
     */
    public void alterarStatusDeAproveitamento(int númeroAtividade, boolean statusAproveitamento, int cargaHorariaConsiderada, Aluno aluno) {
        int índice_aluno = getIndexAluno(aluno);
        alunos.get(índice_aluno).alterarStatusDeAproveitamento(númeroAtividade, statusAproveitamento, cargaHorariaConsiderada);
    }
   
}

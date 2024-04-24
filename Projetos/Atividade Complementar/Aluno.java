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
public class Aluno {
    final private String nome_completo;
    final private int matricula;
    final private String curso;
    private int cargaHorariaTotal;
    private int quantidadeAtividades;
    private List<Atividade> atividades; 

    /**
     * Cria um novo aluno
     * @param nome_completo
     * @param matricula
     * @param curso 
     */
    public Aluno(String nome_completo, int matricula, String curso) {
        this.nome_completo = nome_completo;
        this.matricula = matricula;
        this.curso = curso;
        this.cargaHorariaTotal = 0;
        this.quantidadeAtividades = 0;
        this.atividades = new ArrayList<>();
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public int getCargaHorariaTotal() {
        return cargaHorariaTotal;
    }

    public int getQuantidadeAtividades() {
        return quantidadeAtividades;
    }

    /**
     * Pegar as atividades complementares
     * @return uma cópia da lista das atividades complementares desse aluno
     */
    public List<Atividade> getAtividades() {
        return atividades.subList(0, atividades.size());
    }
    
    /**
     * Insere uma atividade na lista de atividades desse aluno
     * @param grupoAtividade
     * @param descrição 
     */
    public void inserirAtividade(int grupoAtividade, String descrição) {
        Atividade nova_atividade = new Atividade(grupoAtividade, descrição);
        atividades.add(nova_atividade);
        int númeroRegistro;
        
        númeroRegistro = atividades.size() - 1;
        atividades.get(númeroRegistro).setNúmeroRegistro(númeroRegistro);
    }
    
    /**
     * Define o status do aproveitamento da atividade especificada pelo número para verdadeiro ou falso
     * @param númeroAtividade código identificador da atividade
     * @param statusAproveitamento true para aproveitar e false para não aproveitar
     * @param cargaHorariaConsiderada
     * @return true se deu certo alterar o status 
     */
    public boolean alterarStatusDeAproveitamento(int númeroAtividade, boolean statusAproveitamento, int cargaHorariaConsiderada) {
        //verificar se o número da atividade existe
        if(númeroAtividade > atividades.size() - 1){
            return false;
        }
        
        Atividade atividade = atividades.get(númeroAtividade);
                   
        if(statusAproveitamento == true){
            //se já tiver aproveitado apenas retornar
            if(atividade.foiAproveitado()){
             return true;
            }
            this.cargaHorariaTotal += cargaHorariaConsiderada;
            this.quantidadeAtividades++;
        } else {
            //apenas decrementar se tiver alguma atividade aproveitada
            if(this.quantidadeAtividades > 0 && atividade.getCargaHorariaConsiderada() > 0){
                this.quantidadeAtividades--;
            }
            this.cargaHorariaTotal -= atividade.getCargaHorariaConsiderada();
            cargaHorariaConsiderada = 0;
        }
        
        atividade.setStatusAproveitamento(statusAproveitamento, cargaHorariaConsiderada);
        return true;
    }
    
}

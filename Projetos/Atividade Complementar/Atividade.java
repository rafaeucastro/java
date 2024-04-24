/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.complementar;

/**
 *
 * @author Rafael de Sousa Castro
 * Aluno do Instituto Federeal do Ceará
 */
public class Atividade {
    //private String nome_aluno;
    //private int matrícula;
    private int númeroRegistro;
    final private int grupoAtividade;
    final private String descriçãoAtividade;
    private boolean statusAproveitamento;
    private int cargaHorariaConsiderada;

    /**
     * Criar um nova atividade
     * @param grupoAtividade
     * @param descrição 
     */
    public Atividade(int grupoAtividade, String descrição) {
        //this.nome_aluno = nome_aluno;
        //this.matrícula = matrícula;
        this.grupoAtividade = grupoAtividade;
        this.descriçãoAtividade = descrição;
        this.statusAproveitamento = false;
        this.cargaHorariaConsiderada = 0;
        this.númeroRegistro = 0;
    }

    /**
     * Pegar o número de horas das atividades complementares que foram aceitas
     * @return O número de horas consideradas válidas
     */
    public int getCargaHorariaConsiderada() {
        return cargaHorariaConsiderada;
    }

    public int getGrupoAtividade() {
        return grupoAtividade;
    }

    public String getDescriçãoAtividade() {
        return descriçãoAtividade;
    }

    /**
     * 
     * @return Número identificador dessa atividade
     */
    public int getNúmeroRegistro() {
        return númeroRegistro;
    }

    public void setNúmeroRegistro(int númeroRegistro) {
        this.númeroRegistro = númeroRegistro;
    }
    
    public boolean foiAproveitado() {
        return this.statusAproveitamento;
    }

    public String getStatusAproveitamentoAsString() {
        if(this.statusAproveitamento == true){
            return "Aproveitado";
        }
        
        return "Não aproveitado";
    }
    

    public void setStatusAproveitamento(boolean statusAproveitamento, int cargaHorariaConsiderada) {
        this.statusAproveitamento = statusAproveitamento;
        this.cargaHorariaConsiderada = cargaHorariaConsiderada;
    }    
    
}

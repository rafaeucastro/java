/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema02;

/**
 *
 * @author Alunos
 */
public class Produto {
    private String nome_loja;
    private double preço;
    private String descrição = "Produto de informática";

    public String getNome_loja() {
        return nome_loja;
    }

    public void setNome_loja(String nome_loja) {
        this.nome_loja = nome_loja;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public String getDescrição() {
        return descrição;
    }
}

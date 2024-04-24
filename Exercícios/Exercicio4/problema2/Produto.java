package com.mycompany.problema2;

public class Produto {
    private String nome; // nome do produto
    private double precoCusto; // preco de custo do produto
    private double precoVenda; // preco de venda do produto
    private double margemLucro; // margem de lucro do produto

    /**
     * Criar um novo produto
     * @param nome
     */
    public Produto(String nome) {
        this.nome = nome;
    }
    
    /**
     * Obter o nome
     * @return 
     */
    public String getNome() {
        return this.nome;
    }
    /**
     * Definir o nome
     * @param newName 
     */
    public void setNome(String newName) {
        this.nome = newName;
    }
    public double getPrecoCusto() {
        return this.precoCusto;
    }
    /**
     * Definir o preço
     * @param newPrice 
     */
    public void setPrecoCusto(double newPrice) {
        this.precoCusto = newPrice;
    }
    public double getMargemLucro() {
        return this.margemLucro;
    }
    /**
     * Define a margem de lucro
     * @param profitMargin
     */
    public void setMargemLucro(double profitMargin) {
        this.margemLucro = profitMargin;
    }
    public double getPrecoVenda() {
        return this.precoVenda;
    }
    /**
     * Define o preço da venda
     * @param salePrice 
     */
    public void setPrecoVenda(double salePrice) {
        if(salePrice > this.precoCusto) {
            this.precoVenda = salePrice;
        }else {
            System.out.println("Seu preço de venda é menor que o preço de custo");
        }
    }
    /**
     * Calcula a diferença entre o preço da venda e o de custo
     */
    public void calcularMargemLucro() {
        this.margemLucro = this.precoVenda - this.precoCusto;
    }
    /**
     * Retorna a porcentagem de lucro
     * @return 
     */
    public double getMargemLucroPorcentagem() {
        return (this.margemLucro/this.precoCusto)*100;
    }
}

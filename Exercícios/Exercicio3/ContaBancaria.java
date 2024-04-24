// package conta;

public class ContaBancaria {
    //Atributos
    private String nome;
    private String cpf;
    private int número;
    private int agência;
    private double saldo;

    /**
     * Contrutor para criar uma conta bancária para pessoa física
     * @param nome Nome do titular da conta
     * @param cpf   CPF do titular
     * @param número Número da conta
     * @param agência   Agência da conta
     */

    public ContaBancaria(String nome, String cpf, int número, int agência) {
        this.nome = nome;
        this.cpf = cpf;
        this.número = número;
        this.agência = agência;
        // this.saldo = saldo;
    };

    /**
     * Recupera o nome do titular da conta
     * @return o número da conta.
     */
    public String getNome() {
        return this.nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    /**
     * Recupera o número da conta
     * @return
     */
    public int getNúmero() {
        return this.número;
    }
    /**
     * Recupera a agência
     * @return
     */
    public int getAgência() {
        return this.agência;
    }
    /**
     * Recupera o saldo da conta.
     * @return O saldo da conta
     */
    public double getSaldo() {
        return this.saldo;
    }

    /**
     * Efetua um depósito em uma conta
     * @param valor
     */
    public void depositar(double valor) {
        //Crédito na conta
        this.saldo += valor;
    }
    /**
     * Sacar um determinado valor da conta
     * @param valor
     * @return Sucesso ou não da operação
     */
    public boolean sacar(double valor) {
        if(this.saldo - valor >= 0) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Fazer transferência para outra conta
     * @return se a operação teve sucesso
     */
    public String fazerTransferência(ContaBancaria conta, double valor) {
        if(this.saldo - valor < 0) {
            return "Saldo insuficiente";
        }
        this.saldo -= valor;
        conta.depositar(valor);
        return "Sucesso";
    }

    /**
     * Acessa os dados da conta e gera um extrato
     * @return String com os dados bancários.
     */
    public String extratoBancario() {
        return (
            "\nAgência: " + this.agência +
            "\nConta: " + this.número +
            "\nTitular: " + this.nome +
            "\nSaldo: " + this.saldo
        );
    }
}
public class SistemaBanco {
    public void main(String args[]) {
        String nome = "Lirio Rafaeu";
        String cpf = "123.456.789-90";
        int número = 7898050;
        int agência = 5373;

        ContaBancária conta = new ContaBancária(nome, cpf, número, agência);

        //depositar um valor
        conta.depositar(1000);

        //imprimir o saldo atual
        double saldo = conta.getSaldo();
        System.out.println("Seu novo saldo: " + saldo);

        if(conta.sacar(1100.0)) {
            saldo = conta.getSaldo();
            System.out.println("Saldo após o saque: " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }

        System.out.println(conta.extratoBancário());
    }
}

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
// import java.io.*;

public class ContaSimples {
    public static void main(String args[]) {
        String nome = "";
        String cpf = "";
        int número = 0;
        int agência = 0;
        Scanner entrada = new Scanner(System.in);
        Map<String, ContaBancaria> contas = new HashMap<String, ContaBancaria>();
        String[] nomes_das_contas = {"A", "B", "C"};

        for(int index = 0; index < 3; index++) {
            double valor_deposito = 0;

            System.out.println(String.format("-- Criando conta %s --", nomes_das_contas[index]));
            System.out.println("Digite o nome do titular: ");
            nome = entrada.next();
            System.out.println("Seu CPF: ");
            cpf = entrada.next();
            System.out.println("Número da conta: ");
            número = entrada.nextInt();
            System.out.println("Número da agência: ");
            agência = entrada.nextInt();

            ContaBancaria conta = new ContaBancaria(nome, cpf, número, agência);

            System.out.println("Deposite um valor: ");
            valor_deposito = entrada.nextDouble();

            conta.depositar(valor_deposito);
            contas.put(nomes_das_contas[index], conta);
        }

        ContaBancaria A = contas.get("A");
        ContaBancaria B = contas.get("B");
        ContaBancaria C = contas.get("C");

        double valor_transferência = 0;
        System.out.println("\n-- Transferência da conta A para a conta B --");
        System.out.println("Saldo: " + A.getSaldo());
        System.out.println("Quanto deseja tranferir?");
        valor_transferência = entrada.nextDouble();
        String resultado = A.fazerTransferência(B, valor_transferência);
        System.out.println(resultado);
        System.out.println(A.extratoBancario());
        System.out.println(B.extratoBancario());
        
        valor_transferência = 0;
        System.out.println("\n-- Transferência da conta B para a conta C --");
        System.out.println("Saldo: " + B.getSaldo());
        System.out.println("Quanto deseja tranferir?");
        valor_transferência = entrada.nextDouble();
        resultado = B.fazerTransferência(C, valor_transferência);
        System.out.println(resultado);
        System.out.println(B.extratoBancario());
        System.out.println(C.extratoBancario());

        valor_transferência = 0;
        System.out.println("\n-- Transferência da conta C para a conta A --");
        System.out.println("Saldo: " + C.getSaldo());
        System.out.println("Quanto deseja tranferir?");
        valor_transferência = entrada.nextDouble();
        resultado = C.fazerTransferência(A, valor_transferência);
        System.out.println(resultado);
        System.out.println(C.extratoBancario());
        System.out.println(A.extratoBancario());

        entrada.close();
    }
}

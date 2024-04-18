package enumeradores;

public class Main {
    public static void main(String[] args) {
	DiaDaSemana[] dias = DiaDaSemana.values();
	for(DiaDaSemana dia: dias) {
	    System.out.println(dia);
	}
	
	Calculadora[] operacoes = Calculadora.values();
	for(Calculadora operacao: operacoes) {
	    double result = operacao.executarOperacao(10, 5);
	    System.out.println("Operação " + operacao + ": " + result);
	}
	

    }
}

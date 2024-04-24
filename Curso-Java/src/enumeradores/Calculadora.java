package enumeradores;

public enum Calculadora {
	SOMAR('+') {

		@Override
		double executarOperacao(double x, double y) {
			return x + y;
		}

	},
	SUBTRAIR('-') {
		@Override
		double executarOperacao(double x, double y) {
			return x - y;
		}
	},
	MULTIPLICAR('*') {
		@Override
		double executarOperacao(double x, double y) {
			return x * y;
		}
	},
	DIVIDIR('/') {
		@Override
		double executarOperacao(double x, double y) {
			return x / y;
		}
	};

	private char operador;

	Calculadora(char simbolo) {
		this.operador = simbolo;
	}

	abstract double executarOperacao(double x, double y);
	
	public String toString() {
	    return this.operador + "";
	}
}

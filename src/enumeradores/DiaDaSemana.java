package enumeradores;

public enum DiaDaSemana {
    SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);
    
    private int valor;
    
    DiaDaSemana(int valor){
	this.valor = valor;
    }
    
    public int getValor() {
	return this.valor;
    }
}

/*
- Enum extends a classe java.lang.Enum
- Podem ser comparadas usando ==
- Não podem ser instanciadas com new
- Podem implementar interfaces
- Pode ser declarado separadamente ou dentro de classe
 */
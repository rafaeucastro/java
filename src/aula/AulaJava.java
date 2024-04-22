package aula;

public class AulaJava {
     String letter;
    @SuppressWarnings("unused")
	public static void main(String[] args) {
	//TIPOS PRIMITIVOS
	byte value = -127; //8 bits: -127 até 127
	short svalue = 10; //2 bytes
	int valor = 2147483647; //4 bytes
	long adi = 3; //8 bytes
	char letra = 'd'; //8 bits
	boolean isThere = false; //1 bit
	
	//REPRESENTAÇÃO DE INTEIROS
	int decimal = 16;
	int octal = 032;
	int hexa = 0x1b;
	int bina = 0b1101;
	
	System.out.println(value + 1);
	System.out.println(bina);
	
	//ARRAYS
	double[] temperaturas = new double[365];
	temperaturas[0] = 2;
	temperaturas[1] = 4;

	//LOOP FOR MELHORADO
	for(double num : temperaturas) {
	    if(num == 0) {
		continue;
	    }
	    System.out.println(num);
	}
	
	//MATRIZES
	double[][] notasAlunos = new double[30][4];
	notasAlunos[0][0] = 10;
	notasAlunos[0][1] = 7;
	notasAlunos[0][2] = 9;
	notasAlunos[0][3] = 9.5;
	
	notasAlunos[1][0] = 9;
	notasAlunos[1][1] = 8;
	notasAlunos[1][2] = 7.8;
	notasAlunos[1][3] = 9;
	
	
	double[] notasAluno1 = {10, 7, 9, 9.5};
	
	System.out.println(notasAluno1.length);
	
    }
}

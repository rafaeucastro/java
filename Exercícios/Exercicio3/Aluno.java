public class Aluno {
    private int matricula;
    private String nome;
    private double[] etapa1 = new double[2];
    private double[] etapa2 = new double[2];
    private double media_etapa1;
    private double media_etapa2;

    /**
     * Construtor para criar aluno e calcular suas notas
     * @param matricula
     * @param nome
     * @param etapa1
     * @param etapa2
     */

    public Aluno(int matricula, String nome, double[] etapa1, double[] etapa2){
        this.matricula = matricula;
        this.nome = nome;
        this.etapa1 = etapa1;
        this.etapa2 = etapa2;
    }

    /**
     * Recebe código da etapa e pesos de cada avaliação e calcula a média da etapa
     * @param codigoEtapa
     * @param pesoAvaliacao1
     * @param pesoAvaliacao2
     * @return a média do aluno
     */
    public double calcularMediaPorEtapa(int codigoEtapa, int pesoAvaliacao1, int pesoAvaliacao2){
        double media;

        if(codigoEtapa == 1) {
            media = ((etapa1[0] * pesoAvaliacao1) + (etapa1[1] * pesoAvaliacao2)) / (pesoAvaliacao1 + pesoAvaliacao2);
            media_etapa1 = media;
        } if(codigoEtapa == 2) {
            media = ((etapa2[0] * pesoAvaliacao1) + (etapa2[1] * pesoAvaliacao2)) / (pesoAvaliacao1 + pesoAvaliacao2);
            media_etapa2 = media;
        } else {
            return 0.0;
        }

        return media;
    }
    
    public double calculaMediaFinal() {
        return (media_etapa1 + media_etapa2)/2;
    }

    /**
     * Calcular o resultado final do aluno
     * @return situação do aluno
     */
    public String calculaResultadoFinal() {
        double media_final = calculaMediaFinal();

        if(media_final > 0 && media_final < 3.0) {
            return "\nReprovado";
        } else if(media_final >= 3.0 && media_final < 6.0) {
            return "\nAvaliação Final";
        } else if(media_final > 6 && media_final <=10){
            return "\nAprovado";
        }
        return "\nInvalido";
    }

    /**
     * Cria string com o resultado final com todos os dados do aluno
     */
    public String apresentaResultado() {
        String dados_aluno = "Matrícula: " + matricula + "\nNome: " + nome;
        String etapa_1 = "\n1ª Etapa: \nNota 1: " + etapa1[0] + "  -  Nota 2: " + etapa1[1] + "\nMédia N1: " + media_etapa1;
        String etapa_2 = "\n2ª Etapa: \nNota 1: " + etapa2[0] + "  -  Nota 2: " + etapa2[1] + "\nMédia N2: " + media_etapa2;
        return dados_aluno + etapa_1 + etapa_2 + calculaResultadoFinal();
    }
}
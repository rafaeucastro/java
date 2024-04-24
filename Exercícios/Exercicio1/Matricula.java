public class Matricula {
    public class Aluno {
        int matricula;
        String nome;
        double[] etapa1 = new double[2];
        double[] etapa2 = new double[2];
        double media_etapa1;
        double media_etapa2;

        Aluno(){
            
        }

        /**
         * Construtor
         * @param matricula
         * @param nome
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
         * @param peso
         */
        public double calcularMediaPorEtapa(int codigoEtapa, int pesoAvaliacao1, int pesoAvaliacao2){
            double media;

            if(codigoEtapa == 1) {
                media = (etapa1[0] * pesoAvaliacao1) + (etapa1[1] * pesoAvaliacao2) / (pesoAvaliacao1 + pesoAvaliacao2);
                media_etapa1 = media;
            } if(codigoEtapa == 2) {
                media = (etapa2[0] * pesoAvaliacao1) + (etapa2[1] * pesoAvaliacao2) / (pesoAvaliacao1 + pesoAvaliacao2);
                media_etapa2 = media;
            } else {
                return 0.0;
            }

            return media;
        }

        public double calculaMediaFinal() {
            return media_etapa1 + media_etapa2;
        }

        public String calculaResultadoFinal() {
            double media_final = calculaMediaFinal();

            if(media_final > 0 && media_final < 3.0) {
                return "Reprovado";
            } else if(media_final >= 3.0 && media_final < 6.0) {
                return "Avaliação Final";
            } else if(media_final > 6 && media_final <=10){
                return "Aprovado";
            }
            return "Invalido";
        }

        /**
         * Cria string com o resultado final com todos os dados do aluno
         */
        public String apresentaResultado() {
            String dados_aluno = "Matrícula: " + matricula + "\nNome: " + nome;
            String etapa_1 = "\n1ª Etapa: \nNota 1: " + etapa1[0] + "Nota 2: " + etapa1[1] + "\nMédia 1ª Etapa: " + media_etapa1;
            String etapa_2 = "\n2ª Etapa: \nNota 1: " + etapa2[0] + "Nota 2: " + etapa2[1] + "\nMédia 2ª Etapa: " + media_etapa2;
            return dados_aluno + etapa_1 + etapa_2 + calculaResultadoFinal();
        }
    }

    public static void main(String args[]){
        Aluno eulice = new Aluno(1234, "Eulice Silva", {5.7, 6.8}, {8.9, 7.0});
    }
}
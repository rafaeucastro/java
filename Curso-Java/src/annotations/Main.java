package annotations;

@InformacaoAula(autor = "Loiane", aulaNumero = 65)
public class Main {
    public static void main(String[] args) {
        if(Main.class.isAnnotationPresent(InformacaoAula.class)){
            System.out.println("Class is annotated");
            InformacaoAula infoAula = Main.class.getAnnotation(InformacaoAula.class);
            System.out.println(infoAula.aulaNumero());
        } else {
            System.out.println("Sem anotação!");
        }
    }
}

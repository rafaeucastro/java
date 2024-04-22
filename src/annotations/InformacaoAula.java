package annotations;

public @interface InformacaoAula {
    String autor();
    int aulaNumero();
    String blog() default "https://loiane.com";
}

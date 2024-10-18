package br.rsoft.rafa.fallback;

public class MainFallBack {
    public static void main(String[] args) {
        SocialNetworkService service = null;
        try {
            service = new SocialNetworkService(new SocialNetworkAPI());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Chamando serviço 3x...");
        try {
            //Primeira chamada sem sucesso
            MainFallBack.print("1 - Senhas: " + service.listSocialNetWorksFallBack());
            //Segunda chamada com sucesso
            var senhas  = service.listSocialNetWorksFallBack();
            MainFallBack.print("2 - Senhas: " + senhas);

            //Terceira chamada sem sucesso
            var senhas3  = service.listSocialNetWorksFallBack();
            MainFallBack.print("3 - Senhas: " + senhas);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static private void print(String value){
        System.out.println(value + "\n");
    }
}

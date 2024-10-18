package br.rsoft.rafa.fallback;

import java.util.HashMap;

public class SocialNetworkAPI {
    private boolean serviceUnavailable = true;

    // Simulando uma falha no serviço externo na segunda chamada do metodo
    public HashMap<String, String> getSocialNetworksPasswords() throws Exception {
        if(serviceUnavailable){
            this.serviceUnavailable = false;
            throw new Exception("Ocorreu um erro em nosso sistema de redes!");
        }
        this.serviceUnavailable = true;
        return socialNetworks;
    }

    private HashMap<String, String> socialNetworks = new HashMap<>();

    public SocialNetworkAPI() throws InterruptedException {
        this.socialNetworks.put("Facebook", "1235");
        this.socialNetworks.put("Instagram", "6301");

        Thread.sleep(2000);
        this.socialNetworks.put("WhatsApp", "8978");
    }
}

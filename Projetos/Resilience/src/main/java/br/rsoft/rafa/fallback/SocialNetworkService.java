package br.rsoft.rafa.fallback;

import br.rsoft.rafa.cache.SimpleCache;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class SocialNetworkService {
    private final SocialNetworkAPI socialNetworkAPI;
    private SimpleCache<String, String> cache = new SimpleCache<>(Optional.of(5000L));

    SocialNetworkService(SocialNetworkAPI socialNetworkAPI){
        this.socialNetworkAPI = socialNetworkAPI;
    }

    // Simulando uma falha no serviço externo
    public Set<Map.Entry<String, String>> listSocialNetworks() throws Exception {
       var list = this.socialNetworkAPI.getSocialNetworksPasswords();
       list.forEach((key, value) -> this.cache.put(key, value));

       return list.entrySet();
    }

    //Metodo principal com fallback
    public Set<Map.Entry<String, String>> listSocialNetWorksFallBack() {
        try {
            return this.listSocialNetworks();
        } catch (Exception e) {
            System.out.println("Erro detectado: " + e.getMessage());
            System.out.println(this.serviceUnavailableMessage());
            return this.cache.values();
        }
    }

    public String serviceUnavailableMessage(){
        return "Fallback: Serviço indisponível no momento, retornando dados em cache!";
    }
}

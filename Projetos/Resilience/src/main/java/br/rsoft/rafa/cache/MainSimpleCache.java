package br.rsoft.rafa.cache;

import java.util.Optional;

public class MainSimpleCache {
    public static void main(String[] args){
        SimpleCache<String, String> cache = new SimpleCache<>(Optional.of(5000L));

        cache.put("Facebook", "2586");
        System.out.println("Valor da chave: ".concat(cache.get("Facebook")));

        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Valor da chave após expiração: " + cache.get("Facebook"));
    }
}

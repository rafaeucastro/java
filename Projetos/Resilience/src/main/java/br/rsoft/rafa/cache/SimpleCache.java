package br.rsoft.rafa.cache;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class SimpleCache<K, V> {
    private HashMap<K,V> cache;
    private long timeToLive = 5000;
    private HashMap<K, Long> expiryTimes;

    public SimpleCache(Optional<Long> timeToLive){
        timeToLive.ifPresent(aLong -> this.timeToLive = aLong);
        this.cache = new HashMap<>();
        this.expiryTimes = new HashMap<>();
    }

    public void put(K key, V value){
        cache.put(key, value);
        expiryTimes.put(key, System.currentTimeMillis() + timeToLive);
    }

    public V get(K key){
        if(this.cache.containsKey(key)){
            if(isExpired(key)){
                expiryTimes.remove(key);
                return null;
            }
            return this.cache.get(key);
        }

        return null;
    }

    public Set<Map.Entry<K, V>> values(){
        return this.cache.entrySet();
    }

    private boolean isExpired(K key) {
        long currentTime = System.currentTimeMillis();
        return currentTime > this.expiryTimes.get(key);
    }

    public void clear(){
        this.cache.clear();
        this.expiryTimes.clear();
    }
}

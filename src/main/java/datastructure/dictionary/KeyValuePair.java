package datastructure.dictionary;

public class KeyValuePair <K,V>{
    private K key;
    public V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }

}

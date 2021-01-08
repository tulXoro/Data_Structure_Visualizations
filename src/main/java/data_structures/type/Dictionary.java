package main.java.data_structures.type;

public interface Dictionary<K, V> {
    int size();
    K add(K key, V value);
    K remove(K remove);
    V get(K key);
}

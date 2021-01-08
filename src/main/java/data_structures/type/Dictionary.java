package main.java.data_structures.type;

/**
 * Represents a dictionary
 * @param <K> key value
 * @param <V> value to be stored
 */
public interface Dictionary<K, V> {
    int size();
    K add(K key, V value);
    K remove(K remove);
    V get(K key);
}

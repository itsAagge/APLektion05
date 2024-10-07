package ex2student;

import java.util.*;

/**
 * SetHashMap<K,V> implements the MapI<K,V> interface.
 * Note: null is not allowed as a key or a value.
 * Note: Keys must obey the contract for hashCode(), that is,
 *  if k1.equals(k2) is true, then k1.hashCode() == k2.hashCode().
 *  Note: Keys used in a HashMap must be immutable
 *  (more precisely: a change in a key must not change the hashCode()).
 */
public class SetHashMap<K, V> implements MapI<K, V> {
    // capacity is the size of the hash table
    private final int capacity;
    // size is number of entries in this map
    private int size;
    // table is the hash table
    private final HashSet<Entry<K,V>>[] table;

    public SetHashMap() {
        capacity = 11;
        size = 0;
        @SuppressWarnings("unchecked")
        HashSet<Entry<K,V>>[] emptyTable = new HashSet[capacity];
        table = emptyTable;

        // fill the table with empty hash sets
        for (int i = 0; i < table.length; i++) {
            table[i] = new HashSet<>();
        }
    }

    // hash function
    private int hash(K key) {
        return key.hashCode() % capacity;
    }

    // Return the entry in the list at table[hash(k)] of the entry with key k.
    // Return null, if the key k in not found in the list at table[hash(k)].
    private Entry<K, V> entryOfKey(K k) {
        // TODO
        return null;
    }

    /**
     * Return the value corresponding to the key k.
     * Return null, if the key is not in the map.
     */
    @Override
    public V get(K key) {
        // search for entry with the key
        Entry<K, V> entry = this.entryOfKey(key);

        // TODO
        return null;
    }

    /**
     * Insert a (key, value) pair in the map.
     * Return the old value, if the key was in the map before this insertion.
     * If not, return null.
     */
    @Override
    public V put(K key, V value) {
        // TODO
        return null;
    }


    /**
     * Remove the (key, value) pair with the key as key from the map.
     * Return the value, if the key was in the map before this removal.
     * If not, return null.
     */
    @Override
    public V remove(K key) {
        // TODO
        return null;
    }

    /**
     * Return a set with all the keys in the map.
     */
    @Override
    public Set<K> keys() {
        Set<K> keys = new LinkedHashSet<>();
        // TODO
        return keys;
    }

    /**
     * Return a list with all the values in the map.
     */
    @Override
    public List<V> values() {
        List<V> values = new LinkedList<>();
        // TODO
        return values;
    }

    /**
     * Return a set with all the entries in the map.
     */
    public Set<MapI.Entry<K, V>> entries() {
        Set<MapI.Entry<K,V>> entries = new LinkedHashSet<>();
        // TODO
        return entries;
    }

    /**
     * Return the number of (key,value) pairs in the map.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Return true on an empty map, false on a non-empty map.
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    //-------------------------------------------------------------------------

    private static class Entry<K, V> implements MapI.Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K key() {
            return key;
        }

        public V value() {
            return value;
        }

        @Override
        public String toString() {
            return String.format("(%s, %s)", key, value);
        }
    }
}

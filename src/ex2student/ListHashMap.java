package ex2student;

import java.util.*;

public class ListHashMap<K, V> implements MapI<K, V> {
    // capacity is the size of the hash table
    private final int capacity;
    // size is number of entries in this map
    private int size;
    // table is the hash table
    private final LinkedList<Entry<K,V>>[] table;

    public ListHashMap() {
        capacity = 11;
        size = 0;
        @SuppressWarnings("unchecked")
        LinkedList<Entry<K,V>>[] emptyTable = new LinkedList[capacity];
        table = emptyTable;

        // fill the table with empty hash sets
        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // hash function
    private int hash(K key) {
        return key.hashCode() % capacity;
    }

    // Return the entry in the list at table[hash(k)] of the entry with key k.
    // Return null, if the key k in not found in the list at table[hash(k)].
    private Entry<K, V> entryOfKey(K k) {
        for (Entry<K, V> kvEntry : table[hash(k)]) {
            if (kvEntry.key.equals(k)) return kvEntry;
        }
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
        if (entry != null) return entry.value;
        return null;
    }

    /**
     * Insert a (key, value) pair in the map.
     * Return the old value, if the key was in the map before this insertion.
     * If not, return null.
     */
    @Override
    public V put(K key, V value) {
        Entry<K, V> entry = this.entryOfKey(key);
        if (entry != null) {
            V oldValue = entry.value;
            entry.value = value;
            return oldValue;
        } else {
            table[hash(key)].add(new Entry<>(key, value));
            size++;
            return null;
        }
    }


    /**
     * Remove the (key, value) pair with the key as key from the map.
     * Return the value, if the key was in the map before this removal.
     * If not, return null.
     */
    @Override
    public V remove(K key) {
        Entry<K, V> entry = this.entryOfKey(key);
        if (entry != null) {
            V oldValue = entry.value;
            table[hash(key)].remove(entry);
            size--;
            return oldValue;
        }
        return null;
    }

    /**
     * Return a set with all the keys in the map.
     */
    @Override
    public Set<K> keys() {
        Set<K> keys = new LinkedHashSet<>();
        for (LinkedList<Entry<K, V>> entries : table) {
            for (Entry<K, V> entry : entries) {
                keys.add(entry.key);
            }
        }
        return keys;
    }

    /**
     * Return a list with all the values in the map.
     */
    @Override
    public List<V> values() {
        List<V> values = new LinkedList<>();
        for (LinkedList<Entry<K, V>> entries : table) {
            for (Entry<K, V> entry : entries) {
                values.add(entry.value);
            }
        }
        return values;
    }

    /**
     * Return a set with all the entries in the map.
     */
    public Set<MapI.Entry<K, V>> entries() {
        Set<MapI.Entry<K,V>> newEntries = new LinkedHashSet<>();
        for (LinkedList<Entry<K, V>> entries : table) {
            newEntries.addAll(entries);
        }
        return newEntries;
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

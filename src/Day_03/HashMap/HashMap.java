package Day_03.HashMap;

public class HashMap<K, V>
{
    private static final int DEFAULT_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;

    private Entry<K, V>[] table;
    private int size;

    private static class Entry<K, V>
    {
        K key;
        V value;
        boolean deleted;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.deleted = false;
        }
    }

    public HashMap() {
        this(DEFAULT_CAPACITY);
    }

    public HashMap(int capacity) {
        table = new Entry[capacity];
        size = 0;
    }

    private int hash(K key) {
        int h = key.hashCode();
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }

    public void put(K key, V value) {
        if ((double) size / table.length >= LOAD_FACTOR)
        {
            resize();
        }

        int index = findIndex(key);
        if (table[index] == null || table[index].deleted)
        {
            table[index] = new Entry<>(key, value);
            size++;
        }
        else
        {
            table[index].value = value;
        }
    }

    public V get(K key)
    {
        int index = findIndex(key);
        if (table[index] != null && !table[index].deleted)
        {
            return table[index].value;
        }
        return null;
    }

    public void remove(K key)
    {
        int index = findIndex(key);
        if (table[index] != null && !table[index].deleted)
        {
            table[index].deleted = true;
            size--;
        }
    }

    public int size()
    {
        return size;
    }

    private int findIndex(K key)
    {
        int index = hash(key) % table.length;
        while (table[index] != null && (!table[index].key.equals(key) || table[index].deleted))
        {
            index = (index + 1) % table.length;
        }
        return index;
    }

    private void resize()
    {
        int newCapacity = table.length * 2;
        Entry<K, V>[] newTable = new Entry[newCapacity];

        for (Entry<K, V> entry : table)
        {
            if (entry != null && !entry.deleted)
            {
                int index = findIndex(entry.key);
                newTable[index] = entry;
            }
        }
        table = newTable;
    }
}

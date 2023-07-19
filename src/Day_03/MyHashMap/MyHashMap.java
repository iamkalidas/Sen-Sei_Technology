package Day_03.MyHashMap;

public class MyHashMap
{
    private static final int DEFAULT_CAPACITY = 16; // Default size of the array
    private Node[] table;
    private int size;

    public MyHashMap()
    {
        this(DEFAULT_CAPACITY);
    }

    public MyHashMap(int capacity)
    {
        table = new Node[capacity];
        size = 0;
    }

    // Hash function to convert key to an index
    private int hash(String key)
    {
        int hashValue = 0;
        for (char c : key.toCharArray())
        {
            hashValue += c;
        }
        return hashValue % table.length;
    }

    public void put(String key, String value)
    {
        int index = hash(key);
        Node newNode = new Node(key, value);

        // Check if the key already exists at the given index
        Node current = table[index];
        while (current != null) {
            if (current.key.equals(key))
            {
                current.value = value; // Update the value if the key exists
                return;
            }
            current = current.next;
        }

        // Add the new node at the beginning of the linked list
        newNode.next = table[index];
        table[index] = newNode;
        size++;
    }

    public String get(String key)
    {
        int index = hash(key);
        Node current = table[index];

        // Traverse the linked list to find the key
        while (current != null)
        {
            if (current.key.equals(key))
            {
                return current.value; // Return the value if the key is found
            }
            current = current.next;
        }
        return null; // Return null if the key is not found
    }

    public void remove(String key)
    {
        int index = hash(key);
        Node prev = null;
        Node current = table[index];

        // Traverse the linked list to find the key
        while (current != null) {
            if (current.key.equals(key))
            {
                if (prev == null)
                {
                    table[index] = current.next; // Remove the first node
                }
                else
                {
                    prev.next = current.next; // Remove a node in the middle or end
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }
}

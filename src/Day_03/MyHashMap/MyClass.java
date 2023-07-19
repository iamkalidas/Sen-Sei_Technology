package Day_03.MyHashMap;

public class MyClass
{
    public static void main(String[] args)
    {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put("apple", "sweet");
        myHashMap.put("banana", "yellow");
        myHashMap.put("orange", "juicy");

        System.out.println("apple: " + myHashMap.get("apple")); // Output: apple: sweet
        System.out.println("banana: " + myHashMap.get("banana")); // Output: banana: yellow
        System.out.println("orange: " + myHashMap.get("orange")); // Output: orange: juicy
        System.out.println("grape: " + myHashMap.get("grape")); // Output: grape: null (key not found)

        myHashMap.remove("apple");
        System.out.println("apple after removal: " + myHashMap.get("apple")); // Output: apple after removal: null
    }
}

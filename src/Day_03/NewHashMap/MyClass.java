package Day_03.NewHashMap;

public class MyClass
{
    public static void main(String[] args)
    {
        hashmap<Integer, Student> hs = new hashmap<Integer, Student>();

        hs.put(1, new Student(1, "John",35));
        hs.put(2, new Student(2, "karan",36));
        hs.put(3, new Student(3, "rahul",37));

        System.out.println(hs);
    }
}

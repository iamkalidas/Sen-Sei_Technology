package Day_03.HashMap;

public class MainClass
{
    public static void main(String[] args)
    {
        HashMap<Student, Integer> map = new HashMap<>();

        Student student1 = new Student("John", 12345);
        Student student2 = new Student("Alice", 67890);

        map.put(student1, 1);
        map.put(student2, 2);

        System.out.println(map.get(student1)); // Output: 1
        System.out.println(map.get(student2)); // Output: 2

        Student student3 = new Student("John", 12345);
        System.out.println(map.get(student3)); // Output: 1 (since equals and hashCode are overridden)

        map.remove(student2);
        System.out.println(map.size()); // Output: 1
    }
}

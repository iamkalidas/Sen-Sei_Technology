package Day_01;
import java.util.*;
public class StudentMainClass
{
    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Naveen", 20, 1, 85));
        students.add(new Student("Raj", 19, 2, 90));
        students.add(new Student("Akash", 21, 3, 75));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 to sort by name, 1 to sort by age, 2 to sort by ID, 3 to sort by marks:");
        int num = sc.nextInt();
        if(num==0)
            sortByStudentsName(students);
        else if(num==1)
            sortByStudentsAge(students);
        else if(num==2)
            sortByStudentsId(students);
        else if(num==3)
            sortByStudentsMarks(students);
        else
            System.out.println("Invalid input");
    }
    private static void sortByStudentsMarks(List<Student> students)
    {
        Collections.sort(students, Comparator.comparingInt(Student::getMarks));
        System.out.println("\nSorted by marks:");
        sortBy(students);
    }

    private static void sortByStudentsId(List<Student> students)
    {
        Collections.sort(students, Comparator.comparingInt(Student::getId));
        System.out.println("\nSorted by ID:");
        sortBy(students);
    }

    private static void sortByStudentsAge(List<Student> students)
    {
        Collections.sort(students, Comparator.comparingInt(Student::getAge));
        System.out.println("\nSorted by age:");
        sortBy(students);
    }
    private static void sortByStudentsName(List<Student> students)
    {
        Collections.sort(students, Comparator.comparing(Student::getName));
        System.out.println("Sorted by name:");
        sortBy(students);
    }
    private static void sortBy(List<Student> students)
    {
        for (Student student : students)
            System.out.println(student);
    }
}

package Day_01;

class Student
{
    private String name;
    private int age;
    private int id;
    private int marks;

    public Student(String name, int age, int id, int marks)
    {
        this.name = name;
        this.age = age;
        this.id = id;
        this.marks = marks;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public int getId()
    {
        return id;
    }

    public int getMarks()
    {
        return marks;
    }

    public String toString()
    {
        return "Name: " + name + ", Age: " + age + ", ID: " + id + ", Marks: " + marks;
    }
}
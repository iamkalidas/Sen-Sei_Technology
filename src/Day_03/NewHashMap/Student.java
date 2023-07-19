package Day_03.NewHashMap;

import java.util.Objects;

public class Student
{
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id == student.id && age == student.age && Objects.equals(name, student.name);
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}'+"\n";
    }
}

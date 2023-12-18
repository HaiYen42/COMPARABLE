package rikkei.academy.demo_comparable;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student(String a) {
        this.name = a;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // Sắp xếp theo ten-> tuoi
    @Override
    public int compareTo(Student o) {
        int temp = this.getName().compareTo(o.getName());
        if (temp !=0) {
            return temp;
        }
        temp = this.getAge() - o.getAge();
        return temp;
    }
}

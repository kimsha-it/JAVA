package d.inheritance.practice;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("hello" + name + " " + age);
    }
}

class Student extends Person {
    int studentId;
    String major;

    public Student(String name, int age, int studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("introduce student " + name + " " + age + " " + studentId + " " + major);

    }
}

public class Practice1 {
    public static void main(String[] args) {
        Student s = new Student("kim", 20, 0, "");

        s.studentId = 2024001;
        s.major = "컴퓨터공학";
        s.introduce();
    }
}

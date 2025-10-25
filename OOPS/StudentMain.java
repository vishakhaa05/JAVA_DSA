package OOPS;

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // Non-parameterized constructor
    Student() {
        System.out.println("This is a constructor");
    }
}

// Public class name should match the filename: StudentMain.java
public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Alice";
        student1.age = 20;
        student1.printInfo();

        Student student2 = new Student();
        student2.name = "Bob";
        student2.age = 22;
        student2.printInfo();
    }
}

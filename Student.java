package Assignment;
import java.util.ArrayList;
import java.util.Scanner;

 class Student1 {
    protected String name;
    protected int rollNumber;
    protected double grade;

    public void Student(String name, int rollNumber, double grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }


    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade;
    }
}

public class Student {
    public static void main(String[] args) {
        ArrayList<Student1> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Student Record System");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    System.out.print("Enter grade: ");
                    double grade = scanner.nextDouble();

                    Student1 student = new Student1();
                    studentList.add(student);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.println("List of Students:");
                    for (Student1 s : studentList) {
                        System.out.println(s);
                    }
                    break;

                case 3:
                    System.out.print("Enter roll number to search: ");
                    int searchRollNumber = scanner.nextInt();
                    boolean found = false;

                    for (Student1 s : studentList) {
                        if (s.getRollNumber() == searchRollNumber) {
                            System.out.println("Student Found: " + s);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student with roll number " + searchRollNumber + " not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the Student Record System.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}

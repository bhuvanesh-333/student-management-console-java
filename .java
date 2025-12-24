package simpleproject;


import java.util.ArrayList;
import java.util.Scanner;

// Student class to represent student entity
class Student {
    private int id;
    private String name;
    private int age;
    private String course;
    private double marks;

    // Constructor
    public Student(int id, String name, int age, String course, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public double getMarks() {
        return marks;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Display student information
    public void displayStudent() {
        System.out.println("\nStudent ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    // Calculate grade based on marks
    public String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }
}

// Main class for Student Management System
public class studentmangementsystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int studentCounter = 1;

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("  STUDENT MANAGEMENT SYSTEM");
        System.out.println("========================================");

        int choice;
        do {
            displayMenu();
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    displayStatistics();
                    break;
                case 7:
                    System.out.println("\nThank you for using Student Management System!");
                    break;
                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }
        } while (choice != 7);
    }

    // Display menu options
    private static void displayMenu() {
        System.out.println("\n========================================");
        System.out.println("1. Add New Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search Student by ID");
        System.out.println("4. Update Student Information");
        System.out.println("5. Delete Student");
        System.out.println("6. Display Statistics");
        System.out.println("7. Exit");
        System.out.println("========================================");
    }

    // Add new student
    private static void addStudent() {
        System.out.println("\n--- Add New Student ---");
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();
        
        System.out.print("Enter Marks (0-100): ");
        double marks = scanner.nextDouble();
        scanner.nextLine();

        Student student = new Student(studentCounter++, name, age, course, marks);
        students.add(student);
        System.out.println("\nStudent added successfully with ID: " + student.getId());
    }

    // View all students
    private static void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("\nNo students found in the system.");
            return;
        }

        System.out.println("\n--- All Students ---");
        for (Student student : students) {
            student.displayStudent();
            System.out.println("----------------------------------------");
        }
    }

    // Search student by ID
    private static void searchStudent() {
        System.out.print("\nEnter Student ID to search: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Student student = findStudentById(id);
        if (student != null) {
            student.displayStudent();
        } else {
            System.out.println("\nStudent not found with ID: " + id);
        }
    }

    // Update student information
    private static void updateStudent() {
        System.out.print("\nEnter Student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Student student = findStudentById(id);
        if (student == null) {
            System.out.println("\nStudent not found with ID: " + id);
            return;
        }

        System.out.println("\nCurrent Information:");
        student.displayStudent();

        System.out.println("\n--- Update Student Information ---");
        System.out.print("Enter New Name (or press Enter to keep current): ");
        String name = scanner.nextLine();
        if (!name.isEmpty()) {
            student.setName(name);
        }

        System.out.print("Enter New Course (or press Enter to keep current): ");
        String course = scanner.nextLine();
        if (!course.isEmpty()) {
            student.setCourse(course);
        }

        System.out.print("Enter New Marks (or -1 to keep current): ");
        double marks = scanner.nextDouble();
        scanner.nextLine();
        if (marks >= 0) {
            student.setMarks(marks);
        }

        System.out.println("\nStudent information updated successfully!");
    }

    // Delete student
    private static void deleteStudent() {
        System.out.print("\nEnter Student ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Student student = findStudentById(id);
        if (student != null) {
            students.remove(student);
            System.out.println("\nStudent deleted successfully!");
        } else {
            System.out.println("\nStudent not found with ID: " + id);
        }
    }

    // Display statistics
    private static void displayStatistics() {
        if (students.isEmpty()) {
            System.out.println("\nNo students found in the system.");
            return;
        }

        System.out.println("\n--- Statistics ---");
        System.out.println("Total Students: " + students.size());

        double total = 0;
        double highest = students.get(0).getMarks();
        double lowest = students.get(0).getMarks();

        for (Student student : students) {
            double marks = student.getMarks();
            total += marks;
            if (marks > highest) highest = marks;
            if (marks < lowest) lowest = marks;
        }

        double average = total / students.size();
        System.out.println("Average Marks: " + String.format("%.2f", average));
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
    }

    // Helper method to find student by ID
    private static Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}
 this is the code i want to upload this code on my github tell me the repo name,descrption,readme content for this

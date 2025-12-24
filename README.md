# Student Management System (Java Console Application)

This is a simple **console-based Student Management System** written in Java.  
It allows you to manage student records in memory using an interactive menu.  
You can add, view, search, update, and delete students, and also see basic statistics like average, highest, and lowest marks.

---

## Project Overview

This project is a mini Java application that runs in the terminal and demonstrates core Java concepts such as classes, objects, methods, collections, and user input handling.

The application:

- Maintains a list of students using `ArrayList`
- Assigns an auto-incremented ID to each new student
- Calculates grades based on marks
- Displays simple statistics about the stored students

This kind of project is suitable for beginners and can be used in your portfolio to showcase understanding of basic CRUD operations in Java.

---

## Features

The Student Management System provides the following **features**:

- **Add New Student**
  - Enter student name, age, course, and marks.
  - Student ID is auto-generated (`1, 2, 3, ...`).
- **View All Students**
  - Displays all students with:
    - ID  
    - Name  
    - Age  
    - Course  
    - Marks  
    - Calculated grade
- **Search Student by ID**
  - Enter a student ID to view that student’s details.
  - If the ID does not exist, a “Student not found” message is shown.
- **Update Student Information**
  - Update selected fields of a student:
    - Name (press Enter to keep old value)
    - Course (press Enter to keep old value)
    - Marks (enter `-1` to keep old value)
- **Delete Student**
  - Remove a student from the list using their ID.
- **Display Statistics**
  - Shows:
    - Total number of students
    - Average marks
    - Highest marks
    - Lowest marks
- **Grade Calculation**
  - Grade is computed from marks as:
    - 90–100 : `A+`
    - 80–89  : `A`
    - 70–79  : `B`
    - 60–69  : `C`
    - 50–59  : `D`
    - Below 50 : `F`

---

## Technologies Used

This project uses only core Java:

- **Language**: Java
- **Core Concepts**:
  - Classes and objects
  - Methods
  - Encapsulation (private fields with getters/setters)
  - Conditional statements (`if-else`)
  - Loops (`for`, `do-while`)
  - Switch-case
- **Collections**:
  - `ArrayList<Student>` to store student records in memory
- **Input Handling**:
  - `Scanner` for reading user input from the console

---

## Code Structure

All the code is contained in a single file for simplicity.

- **Package**: `simpleproject`
- **Classes**:
  - `Student`
    - Fields: `id`, `name`, `age`, `course`, `marks`
    - Methods:
      - Constructor to initialize student data
      - Getters and setters
      - `displayStudent()` to print details
      - `calculateGrade()` to determine grade from marks
  - `studentmangementsystem` (main class)
    - Contains:
      - `main` method
      - Static `ArrayList<Student> students`
      - Static `Scanner scanner`
      - Static `int studentCounter` for auto ID
      - Menu methods:
        - `displayMenu()`
        - `addStudent()`
        - `viewAllStudents()`
        - `searchStudent()`
        - `updateStudent()`
        - `deleteStudent()`
        - `displayStatistics()`
        - `findStudentById(int id)`

---

## How to Run the Project

Follow these steps to run the project on your machine:

### 1. Prerequisites

- Java Development Kit (JDK) installed (version 8 or above).
- A terminal / command prompt.
- Optionally, an IDE like IntelliJ IDEA, Eclipse, or VS Code with Java support.

### 2. Clone or Download the Repository

If using Git:

git clone https://github.com/<your-username>/java-student-management-system.git
cd java-student-management-system

text

If you are not using Git:

- Create a new folder, for example: `java-student-management-system`
- Save your `.java` file (for example `studentmangementsystem.java`) inside it under the package `simpleproject` or adjust the package as needed.

### 3. Ensure Package and File Structure

If you are using the package `simpleproject` at the top of your file:

package simpleproject;

text

Then your folder structure should look like:

java-student-management-system/
└── simpleproject/
└── studentmangementsystem.java

text

If you do not want to use a package, remove the `package simpleproject;` line and keep the `.java` file directly in the project folder.

### 4. Compile the Code

If using package `simpleproject`:

cd java-student-management-system
javac simpleproject/studentmangementsystem.java

text

Without package:

javac studentmangementsystem.java

text

### 5. Run the Program

With package `simpleproject`:

java simpleproject.studentmangementsystem

text

Without package:

java studentmangementsystem

text

### 6. Use the Menu

Once the program starts, you will see a menu like:

========================================
STUDENT MANAGEMENT SYSTEM
========================================

Add New Student

View All Students

Search Student by ID

Update Student Information

Delete Student

Display Statistics

Exit
========================================
Enter your choice:

text

- Type a number from `1` to `7` and press Enter.
- Follow the prompts to enter details when adding or updating students.

---

## Example Usage

### Adding a Student

1. Choose option `1` (Add New Student).
2. Enter:
   - Name: `Rahul`
   - Age: `20`
   - Course: `B.Tech`
   - Marks: `85`
3. The system will create a student with ID `1` and confirm:

Student added successfully with ID: 1

text

### Viewing All Students

Choose option `2` (View All Students), and you will see output like:

--- All Students ---

Student ID: 1
Name: Rahul
Age: 20
Course: B.Tech
Marks: 85.0
Grade: A
text

---

## Possible Improvements and Next Steps

If you want to extend this project and make it stronger for your portfolio, here are some ideas:

- **Input Validation**
  - Handle invalid inputs (non-numeric age/marks).
  - Restrict marks to the range 0–100.
- **Exception Handling**
  - Use `try-catch` blocks around input and parsing logic.
- **Data Persistence**
  - Save students to a file (e.g., `.txt` or `.csv`) and load them at startup.
  - Or connect to a database like MySQL and store students in a table.
- **Better Class Organization**
  - Move `Student` into its own file `Student.java`.
  - Keep `studentmangementsystem` only for application logic.
- **Testing**
  - Add unit tests using JUnit for methods like `calculateGrade()` and `findStudentById()`.
- **User Interface**
  - Build a GUI version using JavaFX or Swing.
  - Or create a REST API in Spring Boot using similar logic.

These improvements can become separate commits or branches in your GitHub repository to show learning progress.

---

## How to Use This Project in Your Portfolio

- Add this repository link to your resume under **Projects**.
- Mention key points:
  - Java console-based Student Management System
  - Implemented CRUD operations using `ArrayList` and OOP
  - Implemented grade calculation and basic statistics
- You can also record a short demo video of using the app and link it in the README.

---

## License

This project is intended for learning and personal portfolio use.  
You are free to modify the code, experiment with new features, and adapt it as needed.

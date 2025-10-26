import java.util.ArrayList;
import java.util.List;

public class Student {
    // Private instance variables
    private int student_id;
    private String student_name;
    private List<Double> grades;

    // Constructor
    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new ArrayList<>();
    }

    // Getter and Setter for student_id
    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int student_id) {
        if (student_id > 0) {
            this.student_id = student_id;
        } else {
            System.out.println("Invalid student ID. It must be positive.");
        }
    }

    // Getter and Setter for student_name
    public String getStudentName() {
        return student_name;
    }

    public void setStudentName(String student_name) {
        if (student_name != null && !student_name.trim().isEmpty()) {
            this.student_name = student_name;
        } else {
            System.out.println("Invalid student name. It cannot be empty.");
        }
    }

    // Method to add a grade with validation
    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Grade added successfully: " + grade);
        } else {
            System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
        }
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student ID: " + student_id);
        System.out.println("Student Name: " + student_name);
        System.out.println("Grades: " + grades);
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        Student s1 = new Student(101, "Eva Chowdhury");

        s1.addGrade(85.5);
        s1.addGrade(92);
        s1.addGrade(105);  // Invalid grade

        s1.setStudentName("Eva C.");
        s1.setStudentId(-1); // Invalid ID

        s1.displayInfo();
    }
}

    


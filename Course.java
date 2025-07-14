import java.util.Arrays;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
    }

    // Adds a student and dynamically resizes the array if needed
    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] expanded = new String[students.length * 2];
            System.arraycopy(students, 0, expanded, 0, students.length);
            students = expanded;
        }
        students[numberOfStudents++] = student;
    }

    // Returns a copy of the student list with only the enrolled students
    public String[] getStudents() {
        String[] activeStudents = new String[numberOfStudents];
        System.arraycopy(students, 0, activeStudents, 0, numberOfStudents);
        return activeStudents;
    }

    // Returns the number of students
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    // Returns the course name
    public String getCourseName() {
        return courseName;
    }

    // Removes a specific student by shifting array elements
    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                break;
            }
        }
    }

    // Clears all students from the course
    public void clear() {
        students = new String[100];
        numberOfStudents = 0;
    }
}

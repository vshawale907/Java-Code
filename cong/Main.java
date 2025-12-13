package cong;
import java.util.*;

class Student {
    // Encapsulated fields
    private int rollNo;
    private String name;
    private int[] marks; // size = 5

    // Parameterized Constructor
    public Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Method to calculate average of 5 marks
    public double calculateAverage() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum / 5.0; // double value
    }

    // Method to calculate grade based on average
    public char calculateGrade() {
        double avg = calculateAverage();

        if (avg >= 90)
            return 'A';
        else if (avg >= 75)
            return 'B';
        else if (avg >= 60)
            return 'C';
        else
            return 'D';
    }

    // Optional: Display function
    public void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Average : " + calculateAverage());
        System.out.println("Grade   : " + calculateGrade());
    }
}

public class Main {
    public static void main(String[] args) {

        int[] m = { 95, 88, 92, 90, 91 }; // 5 marks

        Student s1 = new Student(101, "Vaibhav", m);

        s1.display(); // Show output
    }
}

package cong;

import java.util.*;

class Employee {
    int empId;
    String empName;
    double basicSalary;
    double[] allowances; 

    public Employee(int empId, String empName, double basicSalary, double[] allowances) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
        this.allowances = allowances;
    }

    

    
    public double calculateTotalSalary() {
        double sum = 0;
        for (double a : allowances) {
            sum += a;
        }
        return basicSalary + sum;
    }

    // Get salary grade
    public String getSalaryGrade() {
        double total = calculateTotalSalary();

        if (total >= 70000) {
            return "High";
        } else if (total >= 40000) {
            return "Medium";
        } else {
            return "Low";
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double[] allow = new double[3];
        System.out.print("Enter HRA: ");
        allow[0] = sc.nextDouble();

        System.out.print("Enter TA: ");
        allow[1] = sc.nextDouble();

        System.out.print("Enter DA: ");
        allow[2] = sc.nextDouble();

        Employee e = new Employee(id, name, basic, allow);

        System.out.println("\nTotal Salary = " + e.calculateTotalSalary());
        System.out.println("Salary Grade = " + e.getSalaryGrade());
    }
}

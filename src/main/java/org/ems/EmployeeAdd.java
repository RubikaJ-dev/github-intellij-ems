package org.ems;

import java.util.*;
public class EmployeeAdd {
    private static ArrayList<Employee> Employeeservice = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void Addemployee() {
        try {
            System.out.println("Enter the number of Employees:");
            int number = sc.nextInt();
            sc.nextLine(); // Consume newline

            for (int i = 0; i < number; i++) {
                Employee emp = getEmployeeDetails();
                if (emp != null) {
                    Employeeservice.add(emp);
                    System.out.println("Employee added successfully!");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a numeric value.");
            sc.nextLine(); // Clear the scanner buffer
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    private static Employee getEmployeeDetails() {
        try {
            System.out.println("Enter name:");
            String name = sc.nextLine();

            System.out.println("Enter department:");
            String department = sc.nextLine();

            int id;
            while (true) {
                try {
                    System.out.println("Enter ID:");
                    id = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    if (isIdDuplicate(id)) {
                        System.out.println("Error: Employee ID already exists! Please enter a unique ID.");
                    } else {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a valid numeric ID.");
                    sc.nextLine(); // Clear buffer
                }
            }

            System.out.println("Enter Contact Information:");
            String contact = sc.nextLine();

            return new Employee(name, department, contact, id);
        } catch (Exception e) {
            System.out.println("An error occurred while entering employee details: " + e.getMessage());
            return null; // Return null to avoid adding an invalid employee
        }
    }

    public static boolean isIdDuplicate(int id) {
        return Employeeservice.stream().anyMatch(e -> e.getID() == id);
    }

    public static ArrayList<Employee> fetchAllEmployees() {
        return Employeeservice;
    }


    public static Employee getEmployeeById(int id) {
        try {
            return Employeeservice.stream()
                    .filter(e -> e.getID() == id)
                    .findFirst()
                    .orElse(null);
        } catch (Exception e) {
            System.out.println("Error fetching employee by ID: " + e.getMessage());
            return null;
        }
    }

    public static boolean deleteEmployee(int id) {
        return Employeeservice.removeIf(e -> e.getID() == id);
    }
}
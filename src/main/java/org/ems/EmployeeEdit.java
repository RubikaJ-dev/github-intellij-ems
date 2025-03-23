package org.ems;

import java.util.*;

public class EmployeeEdit {
    private static Scanner sc = new Scanner(System.in);

    public static void editEmployeeFlow() {
        try {
            System.out.print("Enter Employee ID to edit: ");
            int editId = sc.nextInt();
            sc.nextLine();
            editEmployee(editId);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid numeric ID.");
            sc.nextLine(); // Clear buffer
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void editEmployee(int editId) {
        try {
            ArrayList<Employee> Employeeservice = EmployeeAdd.fetchAllEmployees();

            if (Employeeservice.isEmpty()) {
                System.out.println("\nNo employees available to edit!");
                return;
            }

            for (Employee e : Employeeservice) {
                if (e.getID() == editId) {
                    System.out.println("Editing Employee: " + e.getName());

                    System.out.print("Enter new Name (or press Enter to skip): ");
                    String newName = sc.nextLine();
                    if (!newName.isEmpty()) e.setName(newName);

                    System.out.print("Enter new Department (or press Enter to skip): ");
                    String newDept = sc.nextLine();
                    if (!newDept.isEmpty()) e.setDepartment(newDept);

                    System.out.print("Enter new Contact (or press Enter to skip): ");
                    String newContact = sc.nextLine();
                    if (!newContact.isEmpty()) e.setContact(newContact);

                    System.out.println("Employee details updated successfully.");
                    return;
                }
            }
            System.out.println("Employee ID not found.");
        } catch (Exception e) {
            System.out.println("An error occurred while editing the employee: " + e.getMessage());
        }
    }
}
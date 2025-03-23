package org.ems;

import java.util.*;

public class EmployeeRemove {
    private static Scanner sc = new Scanner(System.in);

    public static void removeEmployee() {
        System.out.print("Enter Employee ID to remove: ");
        int removeId = sc.nextInt();
        sc.nextLine(); // Consume newline

        Employee employee = EmployeeAdd.getEmployeeById(removeId);

        if (employee == null) {
            System.out.println("Employee not found!");
            return;
        }

        System.out.println("Are you sure you want to remove Employee: " + employee.getName() + "? (yes/no)");
        String confirmation = sc.nextLine().trim().toLowerCase();

        if (confirmation.equals("yes")) {
            boolean removed = EmployeeAdd.deleteEmployee(removeId);
            if (removed) {
                System.out.println("Employee removed successfully!");
            } else {
                System.out.println("Error: Employee could not be removed.");
            }
        } else {
            System.out.println("Operation cancelled. Employee not removed.");
        }
    }
}
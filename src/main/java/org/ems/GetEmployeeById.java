package org.ems;

import java.util.*;

public class GetEmployeeById {
    private static Scanner sc = new Scanner(System.in);

    public static void findEmployeeById() {
        System.out.print("Enter Employee ID to search: ");
        int searchId = sc.nextInt();
        sc.nextLine();

        Employee foundEmployee = EmployeeAdd.getEmployeeById(searchId);

        if (foundEmployee != null) {
            System.out.println("\nEmployee Found:");
            System.out.println("Name: " + foundEmployee.getName());
            System.out.println("ID: " + foundEmployee.getID());
            System.out.println("Department: " + foundEmployee.getDepartment());
            System.out.println("Contact: " + foundEmployee.getContact());
        } else {
            System.out.println("Employee not found!");
        }
    }
}
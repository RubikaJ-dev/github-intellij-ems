package org.ems;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\nOptions:");
                System.out.println("1. Add Employees");
                System.out.println("2. Edit Employee");
                System.out.println("3. Fetch Employee by ID");
                System.out.println("4. Fetch All Employees");
                System.out.println("5. Remove Employee");
                System.out.println("6. Exit");
                System.out.print("Choose an option: ");

                int choice = sc.nextInt();
                sc.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        EmployeeAdd.Addemployee();
                        break;
                    case 2:
                        EmployeeEdit.editEmployeeFlow();
                        break;
                    case 3:
                        GetEmployeeById.findEmployeeById();
                        break;
                    case 4:
                        EmployeeFetch.displayAllEmployees();
                        break;
                    case 5:
                        EmployeeRemove.removeEmployee();
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                sc.nextLine(); // Clear buffer
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }
}
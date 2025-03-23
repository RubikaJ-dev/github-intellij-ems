package org.ems;

import java.util.*;

public class EmployeeFetch {
    public static void displayAllEmployees() {
        ArrayList<Employee> employees = EmployeeAdd.fetchAllEmployees();

        if (employees.isEmpty()) {
            System.out.println("\nNo employees available.");
            return;
        }

        System.out.println("\nFetched Employee List:");
        System.out.println("+-------+----------------------+-----------+-----------------+--------------+");
        System.out.printf("| %-5s | %-20s | %-9s | %-15s | %-12s |\n",
                "S.No", "Name", "ID", "Department", "Contact");
        System.out.println("+-------+----------------------+-----------+-----------------+--------------+");

        for (int i = 0; i < employees.size(); i++) {
            Employee e = employees.get(i);
            System.out.printf("| %-5d | %-20s | %-9d | %-15s | %-12s |\n",
                    (i + 1), e.getName(), e.getID(), e.getDepartment(), e.getContact());
        }
        System.out.println("+-------+----------------------+-----------+-----------------+--------------+");
    }
}
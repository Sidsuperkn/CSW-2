package question2;

import java.util.Scanner;

public class _2241011191_Ass1_Q2 {
    public static void main(String[] args) {
        EmployeeApp employeeApp = new EmployeeApp();

        employeeApp.setEmployeeDetails(101, "Aditya SwayamSiddha", "Software Engineer", 50000.0);

        System.out.println("All Employees in the Application:");
        System.out.println(employeeApp);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter employee ID to retrieve: ");
        int employeeIdToRetrieve = sc.nextInt();
        Employee retrievedEmployee = employeeApp.getEmployee(employeeIdToRetrieve);
        if (retrievedEmployee != null) {
            System.out.println("Retrieved Employee: " + retrievedEmployee);
        } else {
            System.out.println("Employee not found.");
        }
        sc.close();
    }
}


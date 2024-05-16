package question4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Employee {
	private int empId;
	private String name,designation;
	private double salary;
	
	Employee(int empId, String name, String designation, double salary){
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return this.empId;
	}
	
	@Override
	public String toString() {
		 return "EmployeeId: " + empId +", Name: " + name +", Designation: " + designation +", Salary: " + salary;
	}
}
class EmployeeApp{
	private List<Employee> employees;
	EmployeeApp(){
		this.employees = new ArrayList<>();
	}
	
	public void addEmployees(int empId, String name, String designation, double salary) {
		Employee employee = new Employee(empId,name,designation,salary);
		employees.add(employee);
	}
	public void displayEmployeeDetails() {
        if (!employees.isEmpty()) {
            System.out.println("Employee Details:");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        } else {
            System.out.println("Employee details not set.");
        }
    }

    public Employee getEmployee(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmpId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "EmployeeApp: " + employees;
    }
}
public class _2241011191_Ass1_Q4_2 {
     public static void main(String[] args) {
    	 EmployeeApp employeeApp = new EmployeeApp();

         employeeApp.addEmployees(101, "Aditya SwayamSiddha", "Software Engineer", 50000.0);

         employeeApp.displayEmployeeDetails();

         employeeApp.addEmployees(102, "Raj Sahoo", "Data Scientist", 60000.0);

         System.out.println("\nAll Employees in the Application:");
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

package question2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeApp {
    private List<Employee> employees;


    public void setEmployeeDetails(int employeeId, String name, String designation, double salary) {
    	if(employees == null) {
    	   employees = new ArrayList<>();
    	}
        Employee employee = new Employee();
        employee.setEmpId(employeeId);
        employee.setName(name);
        employee.setDesignation(designation);
        employee.setSalary(salary);

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

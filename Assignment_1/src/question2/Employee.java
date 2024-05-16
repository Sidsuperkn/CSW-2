package question2;

public class Employee {
	private int empId;
	private String name,designation;
	private double salary;
	
	public int getEmpId() {
		return this.empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDesignation() {
		return this.designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public double getSalary() {
		return this.salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		 return "EmployeeId: " + empId +", Name: " + name +", Designation: " + designation +", Salary: " + salary;
	}
}

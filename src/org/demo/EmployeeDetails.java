package org.demo;
//child class
public class EmployeeDetails extends CourseDetails{

	public void employeeName() {
		System.out.println("Employee name is jessica");
	}
	public void employeeId() {
		System.out.println("Employee id is 282");
	}
	public void employeeSalary() {
		System.out.println("Employee salary is 25000");
	}
	public void employeeDept() {
		System.out.println("Employee dept is quanlity checking");
	}
	
	public static void main(String[] args) {
		//classname objrefname = new classname
		
     EmployeeDetails ed = new EmployeeDetails();
	
	//objrefname.methodname
	
	  ed.employeeName();
	  ed.employeeId();
	  ed.employeeDept();
	  ed.employeeSalary();
	  ed.javaCourse();
	  ed.manual();
	  ed.seleniumCourse();
	  	
	}
	
}

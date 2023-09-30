package org.different;

import org.demo.CourseDetails;
import org.demo.EmployeeDetails;

public class ClassRoom {

	private void classStudentsName() {
			System.out.println("jessica is roll no 1");

	}
	private void classStudentsAcademics() {
		System.out.println("jessica is a bright stuent");
	}
	private void classStudentsDept() {
		System.out.println("jessica studies in commerce dept");
	}
	
	public static void main(String[] args) {
		
		//classname objrefname = new classname
		ClassRoom cr = new ClassRoom();
		
		//ogrefname.methodname
	    cr.classStudentsName();
		cr.classStudentsAcademics();
		cr.classStudentsDept();
		
		CourseDetails cd = new CourseDetails();
		
		cd.javaCourse();
		cd.seleniumCourse();
		cd.manual();
		
		EmployeeDetails ed= new EmployeeDetails();
		
		ed.employeeName();
		ed.employeeId();
		ed.employeeDept();
		ed.employeeSalary();
					
	}
}

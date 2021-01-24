package com.maven.MainApp;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {

	public static void main(String[] args) {
		
		 try {
			 
			 //Create ObjectMapper object 
			ObjectMapper mapper = new ObjectMapper();
			
			//Use readValue() to bind with POJO
			 Employee employee = mapper.readValue(new File("resourses/Employee.json"), Employee.class);
			 
			 //print the object data to check the value
			 
			 System.out.println("The Employee Id: " + employee.getId());
			 System.out.println("The Employee Name: " + employee.getName());
			 System.out.println("The Employee Age: " + employee.getAge());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 

	}

}

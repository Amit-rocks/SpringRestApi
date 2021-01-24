package com.pojoTojson;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.maven.MainApp.Employee;

public class PojoToJson {

	public static void main(String[] args) {
		try {
			
			//create objectMapper object
			ObjectMapper mapper = new ObjectMapper();
			
			Employee employee = new Employee(9,"Sachin",46);
			
			// writeValue() to bind Pojo To Json
			String path = "resourses/Output.json" ;
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			mapper.writeValue(new File(path), employee);
			
			
			System.out.println("The Employee object saved to " + path);
			
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

package com.maven.MainApp;


public class Employee 
{
		private int id ;
        private String name ;
        private int age ;
        
        //  Serialization / call Getter() to bind POJO to JSON  ==>PG
        
        public int getId() {
			return id;
		}
        public String getName() {
        	return name;
        }
		public int getAge() {
			return age;
		}
		
		
		// DeSerialization / call Setter() to bind JSON to POJO  ==>JS 
		public void setId(int id) {
			System.out.println("Inside SetID");
			this.id = id;
			
		}
		public void setName(String name) {
			System.out.println("Inside SetName");
			this.name = name;
		}
		public void setAge(int age) {
			System.out.println("Inside SetAge");
			this.age = age;
		}
		
		// constructor used for POJO to JSON
		public Employee(int id, String name, int age) {
			this.id = id;
			this.name = name;
			this.age = age;
		}
		
		
		
    
}

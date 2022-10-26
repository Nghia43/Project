package com.vti.entity;

public class Department {
		//id phong ban
		int id;
		//Ten phong ban
		String name;
		//1 departmen co nhieu account
		Account[] accounts;
		public Department() {
			
		}
		public Department(String name) {
			this.id = 0;
			this.name = name;
		}
}

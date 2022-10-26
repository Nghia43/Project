package com.vti.frontend;

import com.vti.backend.StudentManagement;

public class Polymorphism {
	public static void main(String[] args) {
		StudentManagement studentManagement = new StudentManagement();

		studentManagement.initStudents();
		studentManagement.caLopDiemDanh();
		studentManagement.nhomDiHoc();
		studentManagement.nhomDiDonVeSinh();
		
	}
}

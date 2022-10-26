package com.vti.backend;
import com.vti.entity.Inheritance.HighSchoolStudent;
public class Inheritance {
//  Question 3: constructor inheritance
//  Tạo class abstract Person gồm các property name và tạo constructor có
//    1 parameter name
//  Tạo class abstract Student kế thừa Person gồm các property id, name
//  và tạo constructor có 2 parameter id, name
//  Tạo class HighSchoolStudent kế thừa Student bao gồm các property id,
//          name, clazz (Lớp đang h�?c), desiredUniversity (trư�?ng đại h�?c mong
//          muốn vào) và tạo constructor có 4 parameter id, name, clazz,
//  desiredUniversity.
//  Hãy khởi tạo Object HighSchoolStudent với các giá trị: id = 1, name =
//          "Nam", clazz = "Chuyên Văn", desiredUniversity = "�?ại h�?c công
//  nghệ"
	
	public void ques3() {
		HighSchoolStudent highSchoolStudent = new HighSchoolStudent("Nghĩa", 1, "Chuyên Thể", 
				 "Đại học thể dục thể thao Bắc Ninh");
		System.out.println(highSchoolStudent);
	}
}

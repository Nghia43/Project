package com.vti.backend;
import java.time.LocalDate;
import com.vti.entity.Department;
import com.vti.entity.Account;
import com.vti.entity.Group;
import com.vti.entity.Position;
public class Exercise1Contructor {
	public static void main(String[] args) {
		ques3();
	}
//	Question 1:
//		Tạo constructor cho department:
//		a) không có parameters
//		b) Có 1 parameter là nameDepartment và default id của
//		Department = 0
//		Khởi tạo 1 Object với mỗi constructor ở trên
	public static void ques1() {
		Department dp = new Department();
		Department dp1 = new Department("Dp1");
		
		System.out.println(dp);
		System.out.println(dp1);
	}
//	Question 2:
//		Tạo constructor cho Account:
//		a) Không có parameters
//		b) Có các parameter là id, Email, Username, FirstName,
//		LastName (với FullName = FirstName + LastName)
//		c) Có các parameter là id, Email, Username, FirstName,
//		LastName (với FullName = FirstName + LastName) và
//		Position của User, default createDate = now
//		d) Có các parameter là id, Email, Username, FirstName,
//		LastName (với FullName = FirstName + LastName) và
//		Position của User, createDate
//		Khởi tạo 1 Object với mỗi constructor ở trên
	public static void ques2() {
		Account ac1 = new Account();
		System.out.println(ac1);
		Account ac2 = new Account(2, "@gmail2", "UserName2", "fullName2");
		System.out.println(ac2);
		Position ps3 = new Position();
		Account ac3 = new Account(3, "@gmail3", "UserName3", "fullName3", ps3);
		System.out.println(ac3);
		System.out.println(ac3.createDate);
		Position ps4 = new Position();
		Account ac4 = new Account(4, "@gmail4", "UserName4", "fullName4", ps4, LocalDate.of(2022, 04, 03));
		System.out.println(ac4);
		
	}
//	Question 3:
//		Tạo constructor cho Group:
//		a) không có parameters
//		b) Có các parameter là GroupName, Creator, array Account[]
//		accounts, CreateDate
//		c) Có các parameter là GroupName, Creator, array String[]
//		usernames , CreateDate
//		Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin
//		username, các thông tin còn lại = null).
//		Khởi tạo 1 Object với mỗi constructor ở trên
	public static void ques3() {
		// a
		Group group = new Group();
		System.out.println(group);

		// b
		Account ac1 = new Account();
		Account ac2 = new Account(2, "@gmail2", "UserName2", "fullName2");
		Position ps3 = new Position();
		Account ac3 = new Account(3, "@gmail3", "UserName3", "fullName3", ps3);
		Account[] accounts = { ac1, ac2, ac3 };
		Group group1 = new Group(1, "Sale", ac2, LocalDate.parse("2020-05-15"), accounts);
		System.out.println(group1);

		// c
		String[] usernames = { "UserName2", "UserName3", "UserName4" };
		System.out.println(group1);
		Group group2 = new Group(2, "Unknow", ac1, usernames, LocalDate.parse("2020-05-15"));
		System.out.println(group2);
	}
	
}

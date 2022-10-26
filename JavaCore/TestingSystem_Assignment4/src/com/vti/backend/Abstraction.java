package com.vti.backend;

import com.vti.entity.Abstraction.Employee;
import com.vti.entity.Abstraction.Manager;
import com.vti.entity.Abstraction.Phone;
import com.vti.entity.Abstraction.VietnamesePhone;
import com.vti.entity.Abstraction.Waiter;

public class Abstraction {
	public void ques1() {
		Phone phone = new VietnamesePhone();
		phone.insertContact("Nghĩa", "0971464645");
		phone.removeContact("Nghĩa");
		phone.updateContact("Nghĩa", "1513465231");
		phone.searchContact("Nghĩa");
	}
	public void ques2_3() {
		Employee employee1 = new Employee("Nghĩa", 7.0);
		employee1.displayInfor();
		
		Manager manager1 = new Manager("Nam", 5.0);
		manager1.displayInfor();
		
		Waiter waiter = new Waiter("Chiến ", 2.6);
		waiter.displayInfor();
	}
	
	
	
}

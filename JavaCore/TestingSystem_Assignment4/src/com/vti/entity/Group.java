package com.vti.entity;
import java.time.LocalDate;
public class Group {
		//
		int id;
		
		String name;
		
		Account creator;
		
		LocalDate createDate;
		
		Account accounts[];
		public Group() {
			
		}
		public Group(int id, String name, Account creator, LocalDate createDate,
				Account[] accounts) {
			this.id = id;
			this.name = name;
			this.creator = creator;
			this.createDate = createDate;
			this.accounts = accounts;
			}
		public Group(int id, String name, Account creator, String[] usernames, LocalDate createDate) {

			this.id = id;
			this.name = name;
			this.creator = creator;
			Account[] accounts = new Account[usernames.length];
			for (int i = 0; i < usernames.length; i++) {
				accounts[i] = new Account(usernames[i]);
			}
			this.createDate = createDate;
}
}
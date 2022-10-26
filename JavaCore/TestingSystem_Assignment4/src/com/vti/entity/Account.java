package com.vti.entity;
import java.time.LocalDate;
import java.util.Arrays;
	public class Account {
	//Table 3: Account
	// AccountID: định danh của User (auto increment)
	// Email:
	// Username:
	// FullName:
	// DepartmentID: phòng ban của user trong hệ thống
	// PositionID: chức vụ của User
	// CreateDate: ngày tạo tài khoản
		int id;
		
		String email;
		
		String userName;
		
		String fullName;
		
		Department department;
		
		Position position;
		
		public LocalDate createDate;
		
		Group[] groups;
		public Account() {}
		public Account(String usernames) {
			
		}
		public Account(int id, String email, String userName, String fullName) {
			this.id = id;
			this.email = email;
			this.userName = userName;
			this.fullName = fullName;
			}
		public Account(int id, String email, String userName, String fullName, Position
				position) {

			this.id = id;
			this.email = email;
			this.userName = userName;
			this.fullName = fullName;
			this.position = position;
			this.createDate = LocalDate.now();
			}
		public Account(int id, String email, String userName, String fullName, Position
				position, LocalDate createDate) {

			super();
			this.id = id;
			this.email = email;
			this.userName = userName;
			this.fullName = fullName;
			this.position = position;
			this.createDate = createDate;
			}
		@Override
		public String toString() {
			return "Account{" + "id=" + id + ", email='" + email + '\'' + ", username='" + userName + '\'' + ", fullname='"
					+ fullName + '\'' + ", department=" + department + ", position=" + position + ", createDate="
					+ createDate + ", groups=" + Arrays.toString(groups) + '}';
		}
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getUsername() {
			return userName;
		}

		public void setUsername(String username) {
			this.userName = username;
		}

		public String getFullname() {
			return fullName;
		}

		public void setFullname(String fullname) {
			this.fullName = fullname;
		}

		public Department getDepartment() {
			return department;
		}

		public void setDepartment(Department department) {
			this.department = department;
		}

		public Position getPosition() {
			return position;
		}

		public void setPosition(Position position) {
			this.position = position;
		}

		public LocalDate getCreateDate() {
			return createDate;
		}

		public void setCreateDate(LocalDate createDate) {
			this.createDate = createDate;
		}

		public Group[] getGroups() {
			return groups;
		}

		public void setGroups(Group[] groups) {
			this.groups = groups;
		}
		
}

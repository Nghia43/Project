import java.time.LocalDate;

public class Exercise1 {
	
	public static void main(String[] args) {
		//Table Department
		Department dp1 = new Department();
		dp1.id = 1;
		dp1.name = "Marketing";
		
		Department dp2 = new Department();
		dp2.id = 2;
		dp2.name = "Sale";
		
		Department dp3 = new Department();
		dp3.id = 3;
		dp3.name = "Security";
		
		Department dp4 = new Department();
		dp4.id = 4;
		dp4.name = "Human Resources";
		
		Department dp5 = new Department();
		dp5.id = 5;
		dp5.name = "Technical";
		
		//Table Position
		Position ps1 = new Position();
		ps1.id = 1;
		ps1.name = "Dev";
		
		Position ps2 = new Position();
		ps2.id = 2;
		ps2.name = "Tester";
		
		Position ps3 = new Position();
		ps3.id = 3;
		ps3.name = "Scrum";
		
		Position ps4 = new Position();
		ps4.id = 4;
		ps4.name = "Master";
		
		Position ps5 = new Position();
		ps5.id = 5;
		ps5.name = "PM";
		
		//Table Group
		Group gr1 = new Group();
		gr1.id = 1;
		gr1.name = "Testing System";
		gr1.creator =1;
		gr1.createDate = LocalDate.of(2020, 03, 07);

		Group gr2 = new Group();
		gr2.id = 2;
		gr2.name = "Sale 01";
		gr2.creator = 2;
		gr2.createDate = LocalDate.of(2020, 03, 07);
		
		Group gr3 = new Group();
		gr3.id = 3;
		gr3.name = "Sale 02";
		gr3.creator = 3;
		gr3.createDate = LocalDate.of(2020, 3, 10);
				
		Group gr4 = new Group();
		gr4.id = 4;
		gr4.name = "Sale 03";
		gr4.creator = 4;
		gr4.createDate = LocalDate.of(2020, 3, 11);
				
		Group gr5 = new Group();
		gr5.id = 5;
		gr5.name = "Marketing";
		gr5.creator = 5;
		gr5.createDate = LocalDate.of(2020, 3, 11);
		
		//Table Account
		Account ac1 = new Account();
		ac1.id = 1; 
		ac1.email = "Email1@gmail.com";
		ac1.userName = "Username1";
		ac1.fullName = "Fullname1";
		ac1.department = dp1;
		ac1.position = ps1;
		ac1.createDate = LocalDate.of(2020, 03, 05);
		ac1.groups = new Group[] {gr1,gr2};
		
		
		Account ac2 = new Account();
		ac2.id = 2; 
		ac2.email = "Email2@gmail.com";
		ac2.userName = "Username2";
		ac2.fullName = "Fullname2";
		ac2.department = dp2;
		ac2.position = ps2;
		ac2.position.id = 2;
		ac2.createDate = LocalDate.of(2020, 03, 05);
		ac2.groups = new Group[] {gr1, gr2};
		
		Account ac3 = new Account();
		ac3.id = 3; 
		ac3.email = "Email3@gmail.com";
		ac3.userName = "Username3";
		ac3.fullName = "Fullname3";
		ac3.department = dp3;
		ac3.position = ps3;
		ac3.createDate = LocalDate.of(2020, 03, 07);
		
		Account ac4 = new Account();
		ac4.id = 4; 
		ac4.email = "Email4@gmail.com";
		ac4.userName = "Username4";
		ac4.fullName = "Fullname4";
		ac4.department = dp4;
		ac4.position = ps4;
		ac4.createDate = LocalDate.of(2020, 03, 07);
		
		Account ac5 = new Account();
		ac5.id = 5; 
		ac5.email = "Email5@gmail.com";
		ac5.userName = "Username5";
		ac5.fullName = "Fullname5";
		ac5.department = dp5;
		ac5.position = ps4;
		ac5.createDate = LocalDate.of(2020, 03, 07);
		
		Account[] accofGroup1 = {ac1, ac2, ac4, ac3, ac5};
		gr1.accounts = accofGroup1;
		
		/*
		 * Question 1: Kiểm tra account thứ 2 Nếu không có phòng ban (tức là department
		 * == null) thì sẽ in ra text "Nhân viên này chưa có phòng ban" Nếu không thì sẽ
		 * in ra text "Phòng ban của nhân viên này là ..."
		 */
//		  if (ac2.department == null) {
//			  System.out.println("Nhan vien nay chua co phong ban"); 
//		  } else {
//			  System.out.println("Phong ban cua nhan vien nay la " + ac2.department.name);
//		  }
		/*
		 * Question 2: Kiểm tra account thứ 2 Nếu không có group thì sẽ in ra text
		 * "Nhân viên này chưa có group" Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra
		 * text "Group của nhân viên này là Java Fresher, C# Fresher" Nếu có mặt trong 3
		 * Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều
		 * group" Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
		 * người hóng chuyện, tham gia tất cả các group"
		 */	
//		if( ac2.groups == null ) {
//			System.out.println("Nhân viên này chưa có group");
//		} else if (ac2.groups.length <= 2) {
//			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
//		} else if (ac2.groups.length == 3) {
//			System.out.println("Nhan vien nay la quan trong, tham gia nhieu phong ban");
//		}else if (ac2.groups.length >= 4) {
//			System.out.println("nhan vien la nguoi hong chuyen, tham gia tat ca cac phong ban");
//		} else {
//			System.out.println("khong co gi");
//		}
		/*Question 3:
				Sử dụng toán tử ternary để làm Question 1
			*/
//		String x = ac2.department == null ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là " + ac2.department.name;
//		System.out.println(x);
//		
		/*Q4
		 * Sử dụng toán tử ternary để làm yêu cầu sau: Kiểm tra Position của account thứ
		 * 1 Nếu Position = Dev thì in ra text "Đây là Developer" Nếu không phải thì in
		 * ra text "Người này không phải là Developer"
		 */
//		String x1 = ac1.position.name == "Dev" ? "Đây là developer"  : "Người này không phải là Developer";
//		System.out.println(x1);
//		
		//Switch case
		/*
		 * Question 5: Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format
		 * sau: Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên" Nếu số lượng
		 * account = 2 thì in ra "Nhóm có hai thành viên" Nếu số lượng account = 3 thì
		 * in ra "Nhóm có ba thành viên" Còn lại in ra "Nhóm có nhiều thành viên"
		 */
//		int x2 = gr1.accounts.length;
//		switch(x2) {
//		case 1:
//			System.out.println("Nhom co mot thanh vien");
//			break;
//		case 2:
//			System.out.println("Nhom co hai thanh vien");
//			break;
//		case 3:
//			System.out.println("Nhom co ba thanh vien");
//			break;
//		default:
//			System.out.println("Nhom co nhieu thanh vien");
//		}
		
		 // Question 6: Sử dụng switch case để làm lại Question 2
//		int sonhom = ac2.groups.length;
//		switch(sonhom) {
//		case 0:
//			System.out.println("Nhan vien nay chua co group");
//			break;
//		case 1:
//			System.out.println("Group cua nhan vien nay la " + ac2.groups[0]);
//			break;
//		case 2:
//			System.out.println("Group cua nhan vien nay la " + ac2.groups[0] + ", " + ac2.groups[1]);
//			break;
//		case 3:
//			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
//			break;
//		default:
//			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
//			break;
//		}
		
		//Question 7: Sử dụng switch case để làm lại Question 4
//		String vitri = ac1.position.name;
//		switch(vitri) {
//		case "Dev":
//			System.out.println("Day la Developer");
//			break;
//		default:
//			System.out.println("Nguoi nay khong phai Developer");
//		}
		
		//FOREACH
		//Question 8:In ra thông tin các account bao gồm: Email, FullName và tên phòng ban củahọ
		Account[] accounts = {ac1, ac2, ac3, ac4, ac5};
//		for(Account account : accounts) {
//			System.out.println("Email: " + account.email);
//			System.out.println("FullName: " + account.fullName);
//			System.out.println("Ten phong ban: " + account.department.name);
//		}
		//Question 9:In ra thông tin các phòng ban bao gồm: id và name
		Department[] departments = {dp1, dp2, dp3, dp4, dp5};
//		for(Department phongban : departments) {
//			System.out.println("Id: " + phongban.id);
//			System.out.println("Name: " + phongban.name);
//		}
		
		//FOR
//		  Question 10: In ra thông tin các account bao gồm: Email, FullName và tên
//		  phòng ban của họ theo định dạng như sau: Thông tin account thứ 1 là: Email:
//		  NguyenVanA@gmail.com Full name: Nguyễn Văn A Phòng ban: Sale Thông tin
//		  account thứ 2 là: Email: NguyenVanB@gmail.com Full name: Nguyễn Văn B Phòng
//		  ban: Marketting
		 
//		int taikhoan;
//		for(taikhoan = 0; taikhoan < accounts.length; taikhoan++) {
//			System.out.println("Thong tin account thu " + (taikhoan + 1) + " la: ");
//			System.out.println("Email: " + accounts[taikhoan].email);
//			System.out.println("FullName: " + accounts[taikhoan].fullName);
//			System.out.println("Phong ban: " + accounts[taikhoan].department.name);
//		}
		
		
//		 Question 11: In ra thông tin các phòng ban bao gồm: id và name theo định dạng
//		 sau: Thông tin department thứ 1 là: Id: 1 Name: Sale Thông tin department thứ
//		 2 là: Id: 2 Name: Marketing
//		 for(int i = 0; i < departments.length; i++) {
//			 System.out.println("Thong tin department thu " + (i+1) +" la: ");
//			 System.out.println("Id: "+ departments[i].id);
//			 System.out.println("Name: "+ departments[i].name);
//		 }
//		Question 12:
//			Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
//		for (int i = 0; i < 2; i++) {
//			System.out.println("Thông tin department thứ " + (i + 1) + " là :");
//			System.out.println("ID: " + departments[i].id);
//			System.out.println("Name: " + departments[i].name);
//		}
		
//		Question 13:
//			In ra thông tin tất cả các account ngoại trừ account thứ 2
//		for (int i = 0; i < accounts.length; i++) {
//			if(i != 1) {
//			System.out.println("Thong tin account thu " + (i + 1) + " la: ");
//			System.out.println("Email: " + accounts[i].email);
//			System.out.println("FullName: " + accounts[i].fullName);
//			System.out.println("Phong ban: " + accounts[i].department.name);
//			}
//		}
//		Question 14:
//			In ra thông tin tất cả các account có id < 4
//		for(int i = 0; i < accounts.length; i++) {
//			if(accounts[i].id < 4 ) {
//				System.out.println("Thông tin department thứ " + (i + 1) + " là :");
//				System.out.println("ID: " + departments[i].id);
//				System.out.println("Name: " + departments[i].name);
//			}
//		}
		
//		Question 15:
//			In ra các số chẵn nhỏ hơn hoặc bằng 20
//		for(int i = 0; i <= 20; i++) {
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
		
		//WHILE
//		Question 16:
//		Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
//		lệnh break, continue
//		byte x = 0;
//		while(x < accounts.length) {
//			System.out.println("Thông tin department thứ " + (x + 1) + " là :");
//			System.out.println("ID: " + departments[x].id);
//			System.out.println("Name: " + departments[x].name);
//			x++;
//		}
		//16-11
//		byte x1 = 0;
//		while(x1 < departments.length) {
//			System.out.println("Thong tin department thu " + (x1+1) +" la: ");
//			 System.out.println("Id: "+ departments[x1].id);
//			 System.out.println("Name: "+ departments[x1].name);
//			 x1++;
//		}
		
		//16-12
//		byte x = 0;
//		while(x < 2) {
//			System.out.println("Thông tin department thứ " + (x + 1) + " là :");
//			System.out.println("ID: " + departments[x].id);
//			System.out.println("Name: " + departments[x].name);
//			x++;
//		}
		
//		//16-13
//		byte x = 0;
//		while(x < accounts.length) {
//			if(x == 1) {
//				x++;
//				continue;
//			}
//			
//			System.out.println("Thong tin account thu " + (x + 1) + " la: ");
//			System.out.println("Email: " + accounts[x].email);
//			System.out.println("FullName: " + accounts[x].fullName);
//			System.out.println("Phong ban: " + accounts[x].department.name);
//			x++;
//		}
		// 16-14
//		byte x = 0;
//		while(x < accounts.length) {
//			if(accounts[x].id < 4) {
//				System.out.println("Thong tin account thu " + (x + 1) + " la: ");
//				System.out.println("Email: " + accounts[x].email);
//				System.out.println("FullName: " + accounts[x].fullName);
//				System.out.println("Phong ban: " + accounts[x].department.name);
//				x++;
//		}
		//DO-WHILE
//		Question 17:
//			Làm lại các Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với
//			lệnh break, continue
		//17-10
//		int x = 0;
//		do {
//			System.out.println("Thong tin account thu " + (x + 1) + " la: ");
//			System.out.println("Email: " + accounts[x].email);
//			System.out.println("FullName: " + accounts[x].fullName);
//			System.out.println("Phong ban: " + accounts[x].department.name);
//			x++;
//		} while(x < accounts.length);
		
		//17-11
		int i = 0;
		do {
			System.out.println("Thong tin department thu " + (i+1) +" la: ");
			 System.out.println("Id: "+ departments[i].id);
			 System.out.println("Name: "+ departments[i].name);
			 i++;
		} while(i < departments.length);
		
//		17-12
//		17-13
		int x = 0;
		do {
			if(x == 1) {
				x++;
				continue;
			}
			System.out.println("Thong tin account thu " + (x + 1) + " la: ");
			System.out.println("Email: " + accounts[x].email);
			System.out.println("FullName: " + accounts[x].fullName);
			System.out.println("Phong ban: " + accounts[x].department.name);
			x++;
		} while(x < accounts.length);
	
		
	}
		
	
}

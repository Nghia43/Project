import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
public class Question3 {

	public static void main(String[] args) {
		//Table Account
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
		
		//Table CategoryQuestion
		CategoryQuestion cq1 = new CategoryQuestion();
		cq1.id = 1;
		cq1.name = "Java";
		
		CategoryQuestion cq2 = new CategoryQuestion();
		cq2.id = 2;
		cq2.name = "PHP";
		
		CategoryQuestion cq3 = new CategoryQuestion();
		cq3.id = 3;
		cq3.name = "C#";
		
		CategoryQuestion cq4 = new CategoryQuestion();
		cq4.id = 4;
		cq4.name = "Ruby";
		
		CategoryQuestion cq5 = new CategoryQuestion();
		cq5.id = 5;
		cq5.name = "Postman";
		
		//Table Exam
		Exam ex1 = new Exam();
		ex1.id = 1;
		ex1.code = "VTI01";
		ex1.title = "De thi C#";
		ex1.category = cq3;
		ex1.duration = "60 minutes";
		ex1.createDate = LocalDate.of(2019, 04, 05);
		
		Exam ex2 = new Exam();
		ex2.id = 2;
		ex2.code = "VTI02";
		ex2.title = "De thi PHP";
		ex2.category = cq2;;
		ex2.duration = "60 minutes";
		ex2.createDate = LocalDate.of(2019, 04, 05);
		
		Exam ex3 = new Exam();
		ex3.id = 3;
		ex3.code = "VTI03";
		ex3.title = "De thi Ruby";
		ex3.category = cq4;
		ex3.duration = "60 minutes";
		ex3.createDate = LocalDate.of(2019, 04, 05);
		
		Exam ex4 = new Exam();
		ex4.id = 4;
		ex4.code = "VTI04";
		ex4.title = "De thi Java";
		ex4.category = cq1;
		ex4.duration = "60 minutes";
		ex4.createDate = LocalDate.of(2019, 04, 05);
		
		Exam ex5 = new Exam();
		ex5.id = 5;
		ex5.code = "VTI05";
		ex5.title = "De thi Postman";
		ex5.category = cq5;
		ex5.duration = "60 minutes";
		ex5.createDate = LocalDate.of(2019, 04, 05);
		
		Account[] accofGroup1 = {ac1, ac2, ac4, ac3, ac5};
		gr1.accounts = accofGroup1;
		
		
		//Q1In ra thông tin Exam thứ 1 và property create date sẽ được format theo định dạng vietnamese
		Locale locale = new Locale("vi", "VN");
		DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		String date = dateformat.format(ac1.createDate);
		System.out.println(ex1.code + ": " + date);

		//Q2 
		
		
		
	}

}

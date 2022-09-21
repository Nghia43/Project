import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
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
		ps1.name = "Developer";
		
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
		ac2.groups = new Group[] {gr1, gr2, gr3};
		
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
		
		//Table GroupAccount
		GroupAccount ga1 = new GroupAccount();
		ga1.group = gr1;
		ga1.account = ac2;
		
		GroupAccount ga2 = new GroupAccount();
		ga2.group = gr3;
		ga2.account = ac2;
		
		GroupAccount ga3 = new GroupAccount();
		ga3.group = gr2;
		ga3.account = ac2;
		
		GroupAccount ga4 = new GroupAccount();
		ga4.group = gr4;
		ga4.account = ac2;
		
		GroupAccount ga5 = new GroupAccount();
		ga5.group = gr5;
		ga5.account = ac2;
		
		//Table TypeQuestion
		TypeQuestion tq1 = new TypeQuestion();
		tq1.id = 1;
		tq1.name = TypeOfQuestion.ESSAY;
		
		TypeQuestion tq2 = new TypeQuestion();
		tq2.id = 2;
		tq2.name = TypeOfQuestion.MULTIPLE_CHOICE;
		
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
		
		//Table Question
		Question qu1 = new Question();
		qu1.id = 1;
		qu1.content = "Cau hoi ve Java";
		qu1.category = cq1;
		qu1.type = tq1;
		qu1.creator = 1;
		qu1.createDate = LocalDate.of(2020, 4, 5);
		
		Question qu2 = new Question();
		qu2.id = 2;
		qu2.content = "Cau hoi ve PHP";
		qu2.category = cq2;
		qu2.type = tq2;
		qu2.creator = 2;
		qu2.createDate = LocalDate.of(2020, 4, 5);
		
		Question qu3 = new Question();
		qu3.id = 3;
		qu3.content = "Cau hoi ve C#";
		qu3.category = cq3;
		qu3.type = tq2;
		qu3.creator = 3;
		qu3.createDate = LocalDate.of(2020, 4, 6);
		
		Question qu4 = new Question();
		qu4.id = 4;
		qu4.content = "Cau hoi ve Ruby";
		qu4.category = cq4;
		qu4.type = tq1;
		qu4.creator = 4;
		qu4.createDate = LocalDate.of(2020, 4, 6);
		
		Question qu5 = new Question();
		qu5.id = 5;
		qu5.content = "Cau hoi ve Postman";
		qu5.category = cq5;
		qu5.type = tq1;
		qu5.creator = 5;
		qu5.createDate = LocalDate.of(2020, 4, 6);
		
		//Table Answer
		Answer ans1 = new Answer();
		ans1.id = 1;
		ans1.content = "Tra loi 01";
		ans1.question = qu1;
		ans1.isCorrect = true;
		
		Answer ans2 = new Answer();
		ans2.id = 2;
		ans2.content = "Tra loi 02";
		ans2.question = qu2;
		ans2.isCorrect = false;
		
		Answer ans3 = new Answer();
		ans3.id = 3;
		ans3.content = "Tra loi 03";
		ans3.question = qu3;
		ans3.isCorrect = false;
		
		Answer ans4 = new Answer();
		ans4.id = 4;
		ans4.content = "Tra loi 04";
		ans4.question = new Question();
		ans4.question.id = 4;
		ans4.isCorrect = true;
		
		Answer ans5 = new Answer();
		ans5.id = 5;
		ans5.content = "Tra loi 05";
		ans5.question = qu2;
		ans5.isCorrect = false;
		
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
		
		//Table ExamQuestion
		ExamQuestion eq1 = new ExamQuestion();
		eq1.id = 1;
		eq1.question = qu1;
		
		ExamQuestion eq2 = new ExamQuestion();
		eq2.id = 2;
		eq2.question = qu2;
		
		ExamQuestion eq3 = new ExamQuestion();
		eq3.id = 3;
		eq3.question = qu3;
		
		ExamQuestion eq4 = new ExamQuestion();
		eq4.id = 4;
		eq4.question = qu4;
		
		ExamQuestion eq5 = new ExamQuestion();
		eq5.id = 5;
		eq5.question = qu5;

	}

}

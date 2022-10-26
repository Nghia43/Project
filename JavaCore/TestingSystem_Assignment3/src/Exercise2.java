import java.time.LocalDate;

public class Exercise2 {

	public static void main(String[] args) {
		Account[] accounts = new Account[5];
		
		//Insert
		for(int i = 0; i < 5; i++) {
			Account ac = new Account();
			ac.email = "Email: " + (i + 1);
			ac.userName = "Username: " + (i + 1);
			ac.fullName = "FullName: " + (i + 1);
			ac.createDate = LocalDate.now();
			accounts[i] = ac;
		}
		for (Account account : accounts) {
			System.out.println(account.email);
			System.out.println(account.userName);
			System.out.println(account.fullName);
			System.out.println(account.createDate);
			System.out.println("\n");
		}
		
		
	}

}

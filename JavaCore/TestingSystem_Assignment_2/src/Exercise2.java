import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class Exercise2 {

	public static void main(String[] args) {
	
		//Q1
		int a = 5;
		System.out.printf("%d%n", a);
		
		//Q2
		int b = 100000000;
		System.out.printf(Locale.US, "%,d%n", b);
		
		//Q3
		float c = 5.567098f;
		System.out.printf("%.4f%n", c);
		
		//Q4
		String name = "Nguyễn Văn A";
		System.out.println("Tên tôi là " + name + " và tôi đang độc thân.");
		//Q5
		String pattern = "dd-MM-yyyy HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		//Q6
		
	}

}

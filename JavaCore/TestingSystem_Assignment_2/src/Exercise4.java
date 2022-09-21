import java.time.LocalDate;
import java.util.Random;
public class Exercise4 {

	public static void main(String[] args) {
		//Q1 In ngẫu nhiên ra 1 số nguyên
		Random random = new Random();
		int x = random.nextInt();
		System.out.println(x);
		//Q2In ngẫu nhiên ra 1 số thực
		float y = random.nextFloat();
		System.out.println(y);
		//Q3Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên
//		ra tên của 1 bạn
		String[] names = {"Trong Nghia", "Thanh Cong", "Nguyen Nam"};
		int i = random.nextInt(names.length);
		System.out.println(names[i]);
		//Q4Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-1995
		int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay();
		int maxDay = (int) LocalDate.of(1995 , 12, 20).toEpochDay();
		long randomInt = minDay + random.nextInt(maxDay - minDay);
		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
		System.out.println(randomDay);
		
//		Question 5:
//			Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
		int d = (int) LocalDate.now().toEpochDay();
		long randomInt2 = d - random.nextInt(365);
		LocalDate randomDay2 = LocalDate.ofEpochDay(randomInt2);
		System.out.println(randomDay2);
		
		// Q6.Lấy ngẫu nhiên 1 ngày trong quá khứ
		
//		Question 7:
//			Lấy ngẫu nhiên 1 số có 3 chữ số
		int a = random.nextInt(999 - 100 + 1) + 100;
		System.out.println(a);
		
	}

}


public class Exercise3 {

	public static void main(String[] args) {
		//Boxing-Unboxing 
		ques1();
		ques2();
		ques3();

	}
// Question 1:
// Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
// Sau đó convert lương ra float và hiển thị lương lên màn hình (với số
// float có 2 số sau dấu thập phân)
	public static void ques1() {
		Integer luong = 5000;
		System.out.printf("%2.2f\n", (float)luong);
		
	}
// Question 2:
// Khai báo 1 String có value = "1234567"
// Hãy convert String đó ra số int
	public static void ques2() {
		String s = "1234567";
		Integer s1 = Integer.parseInt(s);
		System.out.println(s1);
	}
// Question 3:
// Khởi tạo 1 số Integer có value là chữ "1234567"
// Sau đó convert số trên thành datatype int
	public static void ques3() {
		Integer a = 1234567;
		int a1 = a.intValue();
		System.out.println(a1);
	}
}

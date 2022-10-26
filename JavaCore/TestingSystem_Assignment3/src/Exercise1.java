import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		//Q1Khai báo 2 số lương có kiểu dữ liệu là float.
//		Khởi tạo Lương của Account 1 là 5240.5 $
//		Khởi tạo Lương của Account 2 là 10970.055$
//		Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
//		Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
//		float Luong1;
//		float Luong2;
//		Luong1 = 5240.5f;
//		Luong2 = 10970.055f;
//		System.out.println("Luong Account1: " + Luong1 + "\n" + "Luong Account2: " + Luong2);
//		
//		int intLuong1 = (int) Luong1;
//		int intLuong2 = (int) Luong2;
//		System.out.println("intLuong Account1 : " + intLuong1 + "\n" + "intLuong Account2: " + intLuong2);
//		
//		Q2:
//			Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm
//			có số 0 ở đầu cho đủ 5 chữ số)
//		int min = 0;
//		int max = 99999;
//		int a = (int) (Math.random() * max) + min;
//		while(a < 10000) {
//			a *= 10;
//		}
//		System.out.println("So ngau nhien: " + a);

//		Question 3:
//			Lấy 2 số cuối của số ở Question 2 và in ra.
//			Gợi ý:
//			Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
//			Cách 2: chia lấy dư số đó cho 100
//		int min = 0;
//		int max = 99999;
//		int a = (int) (Math.random() * max) + min;
//		while(a < 10000) {
//			a *= 10;
//		}
//		System.out.println("So ngau nhien: " + a);
//		String b = String.valueOf(a);
//		System.out.println("Hai so cuoi: " + b.substring(3));
		ques4();
	}
	//	Question 4:
	//	Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
		public static void ques4() {
			int a, b;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhap so a: ");
			a = scanner.nextInt();
			do {
				System.out.println("Nhap so b khac 0: ");
				b = scanner.nextInt();
			}
			while(b == 0);
			scanner.close();
			System.out.println("Thuong cua a/b la: " + (float)a/ (float)b);
		}

}

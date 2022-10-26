import java.util.Scanner;
public class Exercise4String {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';
    @SuppressWarnings("resource")
	public static void main(String[] args) {
		// String
    	ques14();
		
	}
    
//    Question 1:
//    	Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
//    	thể cách nhau bằng nhiều khoảng trắng );
    @SuppressWarnings("resource")
	public static int ques1CountWords() {
		String input;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap String: ");
		input = scanner.nextLine();
		if (input == null) {
            return -1;
        }
        int count = 0;
        int size = input.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != SPACE && input.charAt(i) != TAB 
                    && input.charAt(i) != BREAK_LINE) {
                if(notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        System.out.println();
        return count;
        
	}
//    Question 2:
//    	Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
    public static void ques2() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Nhap chuoi 1: ");
    	String s1 = scanner.nextLine();
    	
    	System.out.println("Nhap chuoi 2: ");
    	String s2 = scanner.nextLine();
    	
    	System.out.println("Noi 2 chuoi: " + s1.concat(s2));
    	scanner.close();
    }
//    Question 3:
//    	Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chư
//    	viết hoa chữ cái đầu thì viết hoa lên

    public static void ques3() {
    	Scanner scanner = new Scanner(System.in);
    	String name;
    	System.out.println("Nhap ten: ");
    	name = scanner.nextLine();
    	String kytuDau = name.substring(0,1).toUpperCase();
    	String kytuSau = name.substring(1).toLowerCase();
    	name = kytuDau + kytuSau;
    	System.out.println(name);
    	scanner.close();
    	
    }
// Question 4:
// Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên
// của người dùng ra
// VD:
// Người dùng nhập vào "Nam", hệ thống sẽ in ra
// "Ký tự thứ 1 là: N"
// "Ký tự thứ 1 là: A"
// "Ký tự thứ 1 là: M"
    public static void ques4() {
    	Scanner scanner = new Scanner(System.in);
    	String name;
    	System.out.println("Nhap name: ");
    	name = scanner.nextLine();
    	name.toUpperCase();
    	for(int i = 0; i < name.length(); i++) {
    		System.out.println("Ky tu thu " + i + " la: " + name.charAt(i));
    	}
    	scanner.close();
    }
// Question 5:
// Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người
// dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ
    public static void ques5() {
    	Scanner scanner = new Scanner(System.in);
    	String firstname, lastname;
    	System.out.println("Nhap firstname: ");
    	firstname = scanner.nextLine();
    	System.out.println("Nhap lastname: ");
    	lastname = scanner.nextLine();
    	
    	System.out.println("Ho ten: " + firstname.concat(lastname));
    	scanner.close();
    }
// Question 6:
// Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
// sau đó hệ thống sẽ tách ra họ, tên , tên đệm
// VD:
// Người dùng nhập vào "Nguyễn Văn Nam"
// Hệ thống sẽ in ra
// "Họ là: Nguyễn"
// "Họ là: Văn"
// "Họ là: Nam"
    public static void ques6() {
    	Scanner scanner = new Scanner(System.in);
    	String fullname;
    	String firstName = "", middleName = "", lastName = "";
    	System.out.println("Nhap ho ten: ");
    	fullname = scanner.nextLine();
    	fullname.trim();
    	
    	String[] words = fullname.split("\\s");
    	lastName = words[0];
    	firstName = words[words.length - 1];
    	for(int i = 0; i <= words.length; i++) {
    		middleName += words[i] + " ";
    	}
		System.out.println("Họ là: " + lastName);
		System.out.println("Tên đệm là: " + middleName);
		System.out.println("Tên là: " + firstName);

		scanner.close();
    }
// Question 7:
// Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
// chuẩn hóa họ và tên của họ như sau:
// a) Xóa dấu cách ở đầu và cuối của chuỗi người dùng nhập vào
// VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
// chuẩn hóa thành "nguyễn văn nam"
// b) Viết hoa chữ cái mỗi từ của người dùng
// VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
// chuẩn hóa thành "Nguyễn Văn Nam"
    public static void ques7() {
    	Scanner scanner = new Scanner(System.in);
    	String fullName;
    	System.out.println("Nhap ho ten day du: ");
    	fullName = scanner.nextLine();
    	scanner.close();
    	
    	fullName = fullName.trim();
    	fullName = fullName.replaceAll("\\s+", " ");
    	System.out.println("test" + fullName);
    	String[] words = fullName.split(" ");
    	fullName = "";
    	
    	for(String word : words) {
    		String firstCharacter = word.substring(0, 1).toUpperCase();
    		String leftCharacter = word.substring(1);
    		word = firstCharacter + leftCharacter;
    		fullName += word + " ";
    	}
    	System.out.println("Ho ten sau khi chuan hoa: " + fullName);
    }
//    Question 8:
//    	In ra tất cả các group có chứa chữ "Java"
    public static void ques8() {
    	String[] groupNames = {"Java java", "Java 1 2", "akjgnal"};
    	
    	for(String groupName : groupNames) {
    		if(groupName.contains("Java")) {
    			System.out.println(groupName);
    		}
    	}
    }
// Question 9:
// In ra tất cả các group "Java"
    public static void ques9() {
    	String[] groupNames = {"Java", "C#", "C++"};
    	for (String groupName : groupNames) {
    		if(groupName.equals("Java")) {
    			System.out.println(groupName);
    		}
    	}
    }
// Question 10:
// Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
// Nếu có xuất ra “OK” ngược lại “KO”.
// Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
    public static void ques10() {
    	Scanner scanner = new Scanner(System.in);
    	String s1, s2, reverse = "";
    	System.out.println("Nhập chuỗi 1");
    	s1 = scanner.nextLine();
    	System.out.println("Nhập chuỗi 2");
    	s2 = scanner.nextLine();
    	scanner.close();
    	
    	for(int i = s1.length() - 1; i >= 0; i--) {
    		reverse += s1.substring(i, i + 1);
    	}
    	if (s2.equals(reverse)) {
    		System.out.println("Day la chuoi dao nguoc: ");
    	}
    	else {
    		System.out.println("Day khong phai la chuoi dao nguoc: ");
    	}
    }
// Question 11: Count special Character
// Tìm số lần xuất hiện ký tự "a" trong chuỗi
    public static void ques11() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Nhap str: ");
    	String str = scanner.nextLine();
    	scanner.close();
    	
    	int count = 0;
    	for(int i = 0; i < str.length(); i++) {
    		if('a' == str.charAt(i))
    			count++;
    	}
    	System.out.println(count);
    }
// Question 12: Reverse String
// Đảo ngược chuỗi sử dụng vòng lặp
	public static void question12() {
		Scanner scanner = new Scanner(System.in);
		String s1, reverse = "";

		System.out.println("Nhập chuỗi 1");
		s1 = scanner.nextLine();

		for (int i = s1.length() - 1; i >= 0; i--) {
			reverse += s1.charAt(i);
		}

		System.out.println(reverse);

		scanner.close();

	}
// Question 13: String not contains digit
// Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược lại
// true.
// Ví dụ:
// "abc" => true
// "1abc", "abc1", "123", "a1bc", null => false
    public static boolean checkKeyNumber(char ch) {
    	if(ch >= '0' && ch <= '9') {
    		return true;
    	}
    	return false;
    }
    
    public static void ques13() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Nhap str: ");
    	String str = scanner.nextLine();
    	scanner.close();
    	
    	for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				System.out.println("False");
				return;
			}
		}
    	System.out.println("True");
    }
// Question 14: Replace character
// Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác
// cho trước.
// Ví dụ:
// "VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"
    public static void ques14() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Nhap str: ");
    	String str = scanner.nextLine();
    	char ch1, ch2;

    	System.out.println("Nhap ky tu muon chuyen:");
    	ch1 = scanner.nextLine().toCharArray()[0];
    	
    	System.out.println("Nhap ky tu sẽ chuyen:");
    	ch2 = scanner.nextLine().toCharArray()[0];
    	scanner.close();
    	
    	for(int i = 0; i < str.length(); i++) {
    		if(str.charAt(i) == ch1) {
    			str = str.replace(ch1, ch2);
    		}
    	}
    	System.out.println("Chuoi sau khi chuyen: " + str);
    	
    
    }
// Question 15: Revert string by word
// Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng
// thư viện.
// Ví dụ: " I am developer " => "developer am I".4
// Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
// Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt
// chuỗi theo dấu cách
	public static void question15() {
		Scanner scanner = new Scanner(System.in);
		String str;
		
		System.out.println("Chuỗi: ");
		str = scanner.nextLine();
		
		scanner.close();
		
		str = str.trim();
		str = str.replaceAll("\\s+", " ");

		String[] words = str.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
	}
	
// Question 16:
// Cho một chuỗi str và số nguyên n >= 0. Chia chuỗi str ra làm các phần
// bằng nhau với n ký tự. Nếu chuỗi không chia được thì xuất ra màn
// hình “KO”.
		@SuppressWarnings("resource")
		public static void question16() {
			Scanner scanner = new Scanner(System.in);
			String str;
			int n;

			System.out.println("Chuỗi: ");
			str = scanner.nextLine();

			System.out.println("Nhập n: ");
			n = scanner.nextInt();

			scanner.close();

			if (str == null || str.isEmpty() || str.length() % n != 0) {
				System.out.println("No");
				return;
			}

			for (int i = 0; i < str.length(); i += n) {
				System.out.println(str.substring(i, i + n));
			}

		}
	
}

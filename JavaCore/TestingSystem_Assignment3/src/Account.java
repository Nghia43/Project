
import java.time.LocalDate;
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
		
		LocalDate createDate;
		
		Group[] groups;
}

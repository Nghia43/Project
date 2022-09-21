import java.time.LocalDate;

public class Question {

	
		// định danh của câu hỏi (auto increment)
		int id;
		//nội dung của câu hỏi
		String content;
		//định danh của chủ đề câu hỏi
		CategoryQuestion category;
		//định danh của loại câu hỏi
		TypeQuestion type;
		//id của người tạo câu hỏi
		byte creator;
		//ngày tạo câu hỏi
		LocalDate createDate;
	

}

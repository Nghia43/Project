package com.vti.entity;

public class Answer {
		// định danh của câu trả lời (auto increment)
		int id;
		//nội dung của câu trả lời
		String content;
		//định danh của câu hỏi
		Question question;
		//câu trả lời này đúng hay sai
		boolean isCorrect;
}

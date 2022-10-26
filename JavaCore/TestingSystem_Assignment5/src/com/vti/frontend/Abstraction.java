package com.vti.frontend;

import java.util.Scanner;
import com.vti.backend.TuyenSinh;
import com.vti.backend.MyNews;

public class Abstraction {
	public static void main(String[] args) {
		ques4();
		ques5();
	}
	private static void loadmenu() {
		System.out.println("=========MENU=========");
		System.out.println("==1. Insert news    ==");
		System.out.println("==2. View list news ==");
		System.out.println("==3. Average rate   ==");
		System.out.println("==4. Exit           ==");
		System.out.println("======================");
		System.out.println("==Bạn chọn:           ");
	}
	private static void ques4() {
		MyNews myNews = new MyNews();
		Scanner scanner = new Scanner(System.in);
		
		int choose;
		do {
			loadmenu();
			choose = scanner.nextInt();
			switch (choose) {
			case 1:
				myNews.insertNews();
				break;
			case 2:
				myNews.viewListNews();
				break;
			case 3:
				myNews.averageRate();
				myNews.viewListNews();
				break;
			case 4:
				break;
			default:
				System.out.println("Nhap sai! Nhap lai: ");
				break;
			}
		} while(choose != 4);
		scanner.close();	
	}
	private static void loadMenuQues5() {
		System.out.println("===============MENU=================");
		System.out.println("=||1. Thêm mới thí sinh          ||=");
		System.out.println("=||2. Hiện thông tin thí sinh    ||=");
		System.out.println("=||3. Tìm kiếm theo số báo danh  ||=");
		System.out.println("=||4. Thoát                      ||=");
		System.out.println("====================================");
		System.out.println("=====Bạn chọn:                      ");
	}
	private static void ques5() {
		TuyenSinh tuyenSinh = new TuyenSinh();
		Scanner scanner = new Scanner(System.in);
		int choose;
		
		do {
			loadMenuQues5();
			choose = scanner.nextInt();
			
			switch (choose) {
			case 1: 
				tuyenSinh.themThiSinh();
				break;
			case 2:
				tuyenSinh.hienThiSinh();
			case 3:
				tuyenSinh.timThiSinh();
				break;

			case 4:
				break;

			default:
				System.out.println("Nhập sai ! Vui lòng nhập lại !");
				break;
			}

		} while (choose != 4);
		scanner.close();
	}
	
}

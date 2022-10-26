package com.vti.frontend;
import java.util.Scanner;

import com.vti.backend.Inheritance;
import com.vti.backend.QLCB;
import com.vti.backend.QLTV;
public class InheritanceProgram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance inheritance = new Inheritance();
		ques1_2();
		inheritance.ques3();
		ques4();
		
		
	}
	private static void menuQuestion1_2() {
		System.out.println("=======MENU==========");
		System.out.println("==  1. Thêm cán bộ ==");
		System.out.println("==  2. Hiện cán bộ ==");
		System.out.println("==  3. Tìm cán bộ  ==");
		System.out.println("==  4. Xóa cán bộ  ==");
		System.out.println("==  0. Thoát       ==");
		System.out.println("=====================");
	}
	public static void ques1_2() {
		QLCB qlcb = new QLCB();
		
		byte choose;
		do {
			Scanner scanner = new Scanner(System.in);
			menuQuestion1_2();
			choose = scanner.nextByte();
			switch (choose) {
			case 1:
				qlcb.addCanBo();
				break;
			case 2:
				qlcb.printInforCanBo();
				break;
			case 3:
				qlcb.findCanBo();
				break;
			case 4:
				qlcb.deleteCanBo();
				break;
			case 0:
				break;
			default:
				System.out.println("Nhập sai ! Nhập lại !");
				break;
			}
			scanner.close();
		} while (choose != 0);
	}
	private static void menuQuestion4() {
		System.out.println("=======MENU==========");
		System.out.println("==  1. Thêm tài liệu ==");
		System.out.println("==  2. Hiện tài liệu ==");
		System.out.println("==  3. Tìm tài liệu  ==");
		System.out.println("==  4. Xóa tài liệu  ==");
		System.out.println("==  0. Thoát         ==");
		System.out.println("=====================");
	}
	public static void ques4() {
		QLTV qltv = new QLTV();
		
		byte choose;
		do {
			menuQuestion4();
			Scanner scanner = new Scanner(System.in);
			
			choose = scanner.nextByte();
			switch (choose) {
			case 1: 
				qltv.inputTaiLieu();
				break;
			case 2:
				qltv.display();
				break;
			case 3:
				qltv.findTaiLieu();
			case 4:
				qltv.deleteTaiLieu();
				break;
			case 0:
				break;
			default:
				System.out.println("Nhập sai, nhập lại!");
				break;
			}
			scanner.close();
		} while (choose != 0);
		
	}
	
}

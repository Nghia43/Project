package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Abstraction.QuanlySinhvien;

public class TuyenSinh implements ITuyenSinh {
	private Scanner scanner;
	
	private List<QuanlySinhvien> quanLySinhViens;
	public TuyenSinh() {
		quanLySinhViens = new ArrayList<>();
		scanner = new Scanner(System.in);
	}
	
	@Override
	public void themThiSinh() {
		// TODO Auto-generated method stub
		System.out.println("Nhap so thi sinh muon nhap: ");
		int n = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			QuanlySinhvien quanLySinhVien = new QuanlySinhvien();
			quanLySinhVien.nhap();
			quanLySinhViens.add(quanLySinhVien);
		}
	}

	@Override
	public void hienThiSinh() {
		// TODO Auto-generated method stub
		for (QuanlySinhvien quanLySinhVien : quanLySinhViens) {
			System.out.println(quanLySinhVien);
		}
	}

	@Override
	public void timThiSinh() {
		// TODO Auto-generated method stub
		System.out.println("Nhap so bao danh can tim: ");
		String sbd = scanner.nextLine();
		for(QuanlySinhvien quanLySinhVien : quanLySinhViens) {
			if(quanLySinhVien.getSbd().equals(sbd)) {
				System.out.println(quanLySinhVien);
			}
		}
	}
	
	
}

package com.vti.entity.Abstraction;

import java.util.Scanner;

public class QuanlySinhvien {
	private String sbd, hoTen, diaChi;
	private byte mucUuTien;
	private Khoi Khoi;
	
	public String getSbd() {
		return sbd;
	}
	
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public byte getMucUuTien() {
		return mucUuTien;
	}

	public void setMucUutien(byte mucUuTien) {
		this.mucUuTien = mucUuTien;
	}

	public Khoi getKhoi() {
		return Khoi;
	}

	public void setKhoi(Khoi khoi) {
		Khoi = khoi;
	}

	public void setSbd(String sbd) {
		this.sbd = sbd;
	}

	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập số báo danh: ");
		sbd = scanner.nextLine();

		System.out.println("Nhập họ tên: ");
		hoTen = scanner.nextLine();

		System.out.println("Nhập địa chỉ: ");
		diaChi = scanner.nextLine();

		System.out.println("Nhập mức ưu tiên: ");
		mucUuTien = scanner.nextByte();

		System.out.println("Nhập khối A/B/C");
		Khoi khoi = new Khoi();
		khoi.setTenKhoi(scanner.nextLine());
		
		scanner.close();
	}
}


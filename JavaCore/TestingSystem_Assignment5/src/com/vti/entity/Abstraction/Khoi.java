package com.vti.entity.Abstraction;

public class Khoi {
	private String tenKhoi;
	private String monThi;

	public String getTenKhoi() {
		return tenKhoi;
	}

	public void setTenKhoi(String tenKhoi) {
		this.tenKhoi = tenKhoi;
	}

	public String getMonThi() {
		if(tenKhoi.equals("A") ) {
			monThi = "Toan, Ly, Hoa";
		} else if(tenKhoi.equals("B")) {
			monThi = "Văn, Sử, Địa";
		} else {
			monThi = "Không xác định";
		}
		return monThi;
	}

	public void setMonThi(String monThi) {
		this.monThi = monThi;
	}
}

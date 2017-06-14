package Models;

import java.util.Date;

public class DeMon {
	protected String de;
	protected String mon;
	protected String loaiDA;
	protected boolean loaiDe;
	protected String moTa;
	private int slDangKyTD;
	private int slDangKy;
	private int slSVNhom;
	private String ngayBDDangKy;
	private String deadline;
	private String giaoVienPhuTrach;
	private String loaiDeHien;
	
	public DeMon(String de, String mon, String loaiDA, boolean loaiDe, String moTa, int slDangKyTD, int slDangKy, int slSVNhom, String ngayBDDangKy, String deadline, String gv) {
		super();
		this.de = de;
		this.mon = mon;
		this.loaiDA = loaiDA;
		this.loaiDe = loaiDe;
		this.moTa = moTa;
		this.slDangKyTD = slDangKyTD;
		this.slDangKy = slDangKy;
		this.slSVNhom = slSVNhom;
		this.ngayBDDangKy = ngayBDDangKy;
		this.deadline = deadline;
		this.giaoVienPhuTrach = gv;
		this.loaiDe = loaiDe;
		if(loaiDe)
			this.loaiDeHien = "C� nh�n";
		else
			this.loaiDeHien = "Nh�m";
	}
	//ma de
	public String getDe() {
		return de;
	}
	public void setDe(String de) {
		this.de = de;
	}
	//ma mon hoc
	public String getMon() {
		return mon;
	}
	public void setMon(String mon) {
		this.mon = mon;
	}
	//loai do an
	public String getLoaiDA() {
		return loaiDA;
	}
	public void setLoaiDA(String da) {
		this.loaiDA = da;
	}
	//loai de
	public boolean isLoaiDe() {
		return loaiDe;
	}
	public void setLoaiDe(boolean loaiDe) {
		this.loaiDe = loaiDe;
		if(loaiDe)
			this.loaiDeHien = "C� nh�n";
		else
			this.loaiDeHien = "Nh�m";
			
	}
	public String getLoaiDeHien() {
		return loaiDeHien;
	}
	//mo ta
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	//sl dang ky toi da
	public int getSlDangKyTD() {
		return slDangKyTD;
	}
	public void setSlDangKyTD(int slDangKyTD) {
		this.slDangKyTD = slDangKyTD;
	}
	//so luong sinh vien nhom
	public int getSlSVNhom() {
		return slSVNhom;
	}
	public void setSlSVNhom(int slSVNhom) {
		this.slSVNhom = slSVNhom;
	}
	//ngay bat dau dang ky
	public String getNgayBDDangKy() {
		return ngayBDDangKy;
	}
	public void setNgayBDDangKy(String ngayBDDangKy) {
		this.ngayBDDangKy = ngayBDDangKy;
	}
	//sl da dang ky
	public int getSlDangKy() {
		return slDangKy;
	}
	public void setSlDangKy(int slDangKy) {
		this.slDangKy = slDangKy;
	}
	//deadline
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	//giao vien phu trach
	public String getGiaoVienPhuTrach() {
		return giaoVienPhuTrach;
	}
	public void setGiaoVienPhuTrach(String gv) {
		this.giaoVienPhuTrach = gv;
	}
}

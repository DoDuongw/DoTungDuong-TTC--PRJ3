package k23cnt3.dtdDay03.dtdDay03.entity;


public class DtdKhoa {
    private String maKH;
    private String tenKH;

    public DtdKhoa() {
    }

    public DtdKhoa(String maKH, String tenKH) {
        this.maKH = maKH;
        this.tenKH = tenKH;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }
}

package k23cnt3.dtdDay03.dtdDay03.entity;


public class DtdMonHoc {
    private String maMH;
    private String tenMH;
    private int soTiet;

    public DtdMonHoc() {
    }

    public DtdMonHoc(String maMH, String tenMH, int soTiet) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTiet = soTiet;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getSoTiet() {
        return soTiet;
    }

    public void setSoTiet(int soTiet) {
        this.soTiet = soTiet;
    }
}
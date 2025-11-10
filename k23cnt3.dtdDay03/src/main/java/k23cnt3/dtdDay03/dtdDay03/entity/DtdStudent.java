package k23cnt3.dtdDay03.dtdDay03.entity;
//id, name, age, gender, address, phone, email
public class DtdStudent {
    long DtdId;
    String DtdName;
    int DtdAge;
    boolean DtdGender;
    String DtdAddress;
    String DtdPhone;
    String DtdEmail;

    public DtdStudent() {
    }

    public DtdStudent(long DtdId, String DtdName, int DtdAge, boolean DtdGender, String DtdAddress, String DtdPhone, String DtdEmail) {
        this.DtdId = DtdId;
        this.DtdName = DtdName;
        this.DtdAge = DtdAge;
        this.DtdGender = DtdGender;
        this.DtdAddress = DtdAddress;
        this.DtdPhone = DtdPhone;
        this.DtdEmail = DtdEmail;
    }

    public long getDtdId() {
        return DtdId;
    }

    public void setDtdId(long DtdId) {
        this.DtdId = DtdId;
    }

    public String getDtdName() {
        return DtdName;
    }

    public void setDtdName(String DtdName) {
        this.DtdName = DtdName;
    }

    public int getDtdAge() {
        return DtdAge;
    }

    public void setDtdAge(int DtdAge) {
        this.DtdAge = DtdAge;
    }

    public boolean isDtdGender() {
        return DtdGender;
    }

    public void setDtdGender(boolean DtdGender) {
        this.DtdGender = DtdGender;
    }

    public String getDtdAddress() {
        return DtdAddress;
    }

    public void setDtdAddress(String DtdAddress) {
        this.DtdAddress = DtdAddress;
    }

    public String getDtdPhone() {
        return DtdPhone;
    }

    public void setDtdPhone(String DtdPhone) {
        this.DtdPhone = DtdPhone;
    }

    public String getDtdEmail() {
        return DtdEmail;
    }

    public void setDtdEmail(String DtdEmail) {
        this.DtdEmail = DtdEmail;
    }
}

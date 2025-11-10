package k23cnt3.dtdDay03.dtdDay03.Dtdservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DtdKhoaService {
    private List<k23cnt3.dtdDay03.dtdDay03.entity.DtdKhoa> khoaList = new ArrayList<>();

    public DtdKhoaService() {
        khoaList.addAll(Arrays.asList(
                new k23cnt3.dtdDay03.dtdDay03.entity.DtdKhoa("KH01", "Công nghệ thông tin"),
                new k23cnt3.dtdDay03.dtdDay03.entity.DtdKhoa("KH02", "Điện tử viễn thông"),
                new k23cnt3.dtdDay03.dtdDay03.entity.DtdKhoa("KH03", "Cơ khí"),
                new k23cnt3.dtdDay03.dtdDay03.entity.DtdKhoa("KH04", "Xây dựng"),
                new k23cnt3.dtdDay03.dtdDay03.entity.DtdKhoa("KH05", "Kinh tế")
        ));
    }

    public List<k23cnt3.dtdDay03.dtdDay03.entity.DtdKhoa> getAllKhoa() {
        return khoaList;
    }

    public k23cnt3.dtdDay03.dtdDay03.entity.DtdKhoa getKhoaByMaKH(String maKH) {
        return khoaList.stream()
                .filter(khoa -> khoa.getMaKH().equals(maKH))
                .findFirst()
                .orElse(null);
    }

    public k23cnt3.dtdDay03.dtdDay03.entity.DtdKhoa addKhoa(k23cnt3.dtdDay03.dtdDay03.entity.DtdKhoa khoa) {
        khoaList.add(khoa);
        return khoa;
    }

    public k23cnt3.dtdDay03.dtdDay03.entity.DtdKhoa updateKhoa(String maKH, k23cnt3.dtdDay03.dtdDay03.entity.DtdKhoa khoa) {
        k23cnt3.dtdDay03.dtdDay03.entity.DtdKhoa existingKhoa = getKhoaByMaKH(maKH);
        if (existingKhoa == null) {
            return null;
        }

        existingKhoa.setTenKH(khoa.getTenKH());
        return existingKhoa;
    }

    public boolean deleteKhoa(String maKH) {
        k23cnt3.dtdDay03.dtdDay03.entity.DtdKhoa khoa = getKhoaByMaKH(maKH);
        if (khoa != null) {
            return khoaList.remove(khoa);
        }
        return false;
    }
}
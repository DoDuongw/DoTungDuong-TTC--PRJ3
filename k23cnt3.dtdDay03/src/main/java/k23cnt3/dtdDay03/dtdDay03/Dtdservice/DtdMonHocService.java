package k23cnt3.dtdDay03.dtdDay03.Dtdservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DtdMonHocService {
    private List<k23cnt3.dtdDay03.dtdDay03.entity.DtdMonHoc> monHocList = new ArrayList<>();

    public DtdMonHocService() {
        monHocList.addAll(Arrays.asList(
                new k23cnt3.dtdDay03.dtdDay03.entity.DtdMonHoc("MH01", "Lập trình Java", 45),
                new k23cnt3.dtdDay03.dtdDay03.entity.DtdMonHoc("MH02", "Cơ sở dữ liệu", 30),
                new k23cnt3.dtdDay03.dtdDay03.entity.DtdMonHoc("MH03", "Mạng máy tính", 40),
                new k23cnt3.dtdDay03.dtdDay03.entity.DtdMonHoc("MH04", "Toán cao cấp", 60),
                new k23cnt3.dtdDay03.dtdDay03.entity.DtdMonHoc("MH05", "Tiếng Anh chuyên ngành", 35)
        ));
    }

    public List<k23cnt3.dtdDay03.dtdDay03.entity.DtdMonHoc> getAllMonHoc() {
        return monHocList;
    }

    public k23cnt3.dtdDay03.dtdDay03.entity.DtdMonHoc getMonHocByMaMH(String maMH) {
        return monHocList.stream()
                .filter(monHoc -> monHoc.getMaMH().equals(maMH))
                .findFirst()
                .orElse(null);
    }

    public k23cnt3.dtdDay03.dtdDay03.entity.DtdMonHoc addMonHoc(k23cnt3.dtdDay03.dtdDay03.entity.DtdMonHoc monHoc) {
        monHocList.add(monHoc);
        return monHoc;
    }

    public k23cnt3.dtdDay03.dtdDay03.entity.DtdMonHoc updateMonHoc(String maMH, k23cnt3.dtdDay03.dtdDay03.entity.DtdMonHoc monHoc) {
        k23cnt3.dtdDay03.dtdDay03.entity.DtdMonHoc existingMonHoc = getMonHocByMaMH(maMH);
        if (existingMonHoc == null) {
            return null;
        }

        existingMonHoc.setTenMH(monHoc.getTenMH());
        existingMonHoc.setSoTiet(monHoc.getSoTiet());
        return existingMonHoc;
    }

    public boolean deleteMonHoc(String maMH) {
        k23cnt3.dtdDay03.dtdDay03.entity.DtdMonHoc monHoc = getMonHocByMaMH(maMH);
        if (monHoc != null) {
            return monHocList.remove(monHoc);
        }
        return false;
    }
}
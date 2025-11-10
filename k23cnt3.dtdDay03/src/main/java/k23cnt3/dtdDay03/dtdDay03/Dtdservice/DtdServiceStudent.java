package k23cnt3.dtdDay03.dtdDay03.Dtdservice;

import k23cnt3.dtdDay03.dtdDay03.entity.DtdStudent;
import org.springframework.stereotype.Service;

import  java.util.*;



@Service
public class DtdServiceStudent {
    List<DtdStudent> DtdStudents ;

    public DtdServiceStudent(){
        DtdStudents = List.of(
                new DtdStudent(1L, "Đỗ Tùng Dương", 20, true, "Hà Nội", "0375526086", "atgdotungduong@gmail.com"),
                new DtdStudent(2L, "Trần Thị Bình", 21, false, "Hải Phòng", "0987654321", "binh.tran@example.com"),
                new DtdStudent(3L, "Lê Minh Cường", 22, true, "Đà Nẵng", "0905123456", "cuong.le@example.com"),
                new DtdStudent(4L, "Phạm Thảo Vy", 19, false, "TP. Hồ Chí Minh", "0978123456", "vy.pham@example.com"),
                new DtdStudent(5L, "Võ Đức Hoàng", 23, true, "Cần Thơ", "0932123456", "hoang.vo@example.com"),
                new DtdStudent(6L, "Hoàng Lan Chi", 20, false, "Nam Định", "0945123123", "chi.hoang@example.com"),
                new DtdStudent(7L, "Ngô Văn Tuấn", 24, true, "Thanh Hóa", "0915456789", "tuan.ngo@example.com"),
                new DtdStudent(8L, "Đặng Mai Hương", 22, false, "Nghệ An", "0967345678", "huong.dang@example.com"),
                new DtdStudent(9L, "Lý Quốc Bảo", 21, true, "Bình Dương", "0902345678", "bao.ly@example.com"),
                new DtdStudent(10L, "Đỗ Thị Hạnh", 20, false, "Vĩnh Long", "0923456789", "hanh.do@example.com")
        );
    }
    // Các phương thức
    // Lấy toàn bộ danh sách sinh viên
    public List<DtdStudent> getDtdStudents() {
        return  DtdStudents;
    }

    // Lấy sinh viên theo id
    public DtdStudent getDtdStudent(Long DtdId) {
        return DtdStudents.stream()
                .filter(student -> student
                        .getDtdId() == DtdId)
                .findFirst().orElse(null);
    }

}

package k23cnt3.dtdDay03.dtdDay03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/khoa")
public class DtdKhoaController {

    @Autowired
    private k23cnt3.dtdDay03.dtdDay03.Dtdservice.DtdKhoaService khoaService;

    @GetMapping
    public List<k23cnt3.dtdDay03.dtdDay03.entity.DtdKhoa> getAllKhoa() {
        return khoaService.getAllKhoa();
    }

    @GetMapping("/{maKH}")
    public k23cnt3.dtdDay03.dtdDay03.entity.DtdKhoa getKhoaByMaKH(@PathVariable String maKH) {
        return khoaService.getKhoaByMaKH(maKH);
    }

    @PostMapping
    public k23cnt3.dtdDay03.dtdDay03.entity.DtdKhoa addKhoa(@RequestBody k23cnt3.dtdDay03.dtdDay03.entity.DtdKhoa khoa) {
        return khoaService.addKhoa(khoa);
    }

    @PutMapping("/{maKH}")
    public k23cnt3.dtdDay03.dtdDay03.entity.DtdKhoa updateKhoa(@PathVariable String maKH, @RequestBody k23cnt3.dtdDay03.dtdDay03.entity.DtdKhoa khoa) {
        return khoaService.updateKhoa(maKH, khoa);
    }

    @DeleteMapping("/{maKH}")
    public boolean deleteKhoa(@PathVariable String maKH) {
        return khoaService.deleteKhoa(maKH);
    }
}
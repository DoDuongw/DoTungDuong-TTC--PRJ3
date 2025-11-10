package k23cnt3.dtdDay03.dtdDay03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/monhoc")
public class DtdMonHocController {

    @Autowired
    private k23cnt3.dtdDay03.dtdDay03.Dtdservice.DtdMonHocService monHocService;

    @GetMapping
    public List<k23cnt3.dtdDay03.dtdDay03.entity.DtdMonHoc> getAllMonHoc() {
        return monHocService.getAllMonHoc();
    }

    @GetMapping("/{maMH}")
    public k23cnt3.dtdDay03.dtdDay03.entity.DtdMonHoc getMonHocByMaMH(@PathVariable String maMH) {
        return monHocService.getMonHocByMaMH(maMH);
    }

    @PostMapping
    public k23cnt3.dtdDay03.dtdDay03.entity.DtdMonHoc addMonHoc(@RequestBody k23cnt3.dtdDay03.dtdDay03.entity.DtdMonHoc monHoc) {
        return monHocService.addMonHoc(monHoc);
    }

    @PutMapping("/{maMH}")
    public k23cnt3.dtdDay03.dtdDay03.entity.DtdMonHoc updateMonHoc(@PathVariable String maMH, @RequestBody k23cnt3.dtdDay03.dtdDay03.entity.DtdMonHoc monHoc) {
        return monHocService.updateMonHoc(maMH, monHoc);
    }

    @DeleteMapping("/{maMH}")
    public boolean deleteMonHoc(@PathVariable String maMH) {
        return monHocService.deleteMonHoc(maMH);
    }
}
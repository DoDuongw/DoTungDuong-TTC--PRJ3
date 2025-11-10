package k23cnt3.dtdDay03.dtdDay03.controller;

import k23cnt3.dtdDay03.dtdDay03.entity.DtdStudent;
import k23cnt3.dtdDay03.dtdDay03.Dtdservice.DtdServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class DtdStudentController {
    @Autowired
    public DtdServiceStudent DtdServiceStudent;

    @GetMapping("/student-list")
    public List<DtdStudent> getAllStudents() {
        return  DtdServiceStudent.getDtdStudents();
    }

    @GetMapping("/student/{DtdId}")
    public DtdStudent getDtdStudentById(@PathVariable String DtdId)
    {
        Long param = Long.parseLong(DtdId);
        return  DtdServiceStudent.getDtdStudent(param);
    }

}

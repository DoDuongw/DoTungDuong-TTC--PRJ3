package k23cnt3.dtdDay03.dtdDay03.controller;

import k23cnt3.dtdDay03.dtdDay03.Dtdservice.DtdEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class DtdEmployeeController {

    @Autowired
    private DtdEmployeeService employeeService;

    @GetMapping
    public List<k23cnt3.dtdDay03.dtdDay03.entity.DtdEmployee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public k23cnt3.dtdDay03.dtdDay03.entity.DtdEmployee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public k23cnt3.dtdDay03.dtdDay03.entity.DtdEmployee addEmployee(@RequestBody k23cnt3.dtdDay03.dtdDay03.entity.DtdEmployee employee) {
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/{id}")
    public k23cnt3.dtdDay03.dtdDay03.entity.DtdEmployee updateEmployee(@PathVariable Long id, @RequestBody k23cnt3.dtdDay03.dtdDay03.entity.DtdEmployee employee) {
        return employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public boolean deleteEmployee(@PathVariable Long id) {
        return employeeService.deleteEmployee(id);
    }
}
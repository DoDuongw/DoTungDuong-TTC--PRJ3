package k23cnt3.dtdDay03.dtdDay03.Dtdservice;

import k23cnt3.dtdDay03.dtdDay03.entity.DtdEmployee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DtdEmployeeService {
    private List<DtdEmployee> employeeList = new ArrayList<>();

    public DtdEmployeeService() {
        employeeList.addAll(Arrays.asList(
                new DtdEmployee(1L, "Nguyễn Văn A", "Nam", 25, 15000000),
                new DtdEmployee(2L, "Trần Thị B", "Nữ", 28, 18000000),
                new DtdEmployee(3L, "Lê Văn C", "Nam", 32, 22000000),
                new DtdEmployee(4L, "Phạm Thị D", "Nữ", 26, 16000000),
                new DtdEmployee(5L, "Hoàng Văn E", "Nam", 30, 20000000)
        ));
    }

    public List<DtdEmployee> getAllEmployees() {
        return employeeList;
    }

    public DtdEmployee getEmployeeById(Long id) {
        return employeeList.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public DtdEmployee addEmployee(DtdEmployee employee) {
        employeeList.add(employee);
        return employee;
    }

    public DtdEmployee updateEmployee(Long id, DtdEmployee employee) {
        DtdEmployee existingEmployee = getEmployeeById(id);
        if (existingEmployee == null) {
            return null;
        }

        existingEmployee.setFullName(employee.getFullName());
        existingEmployee.setGender(employee.getGender());
        existingEmployee.setAge(employee.getAge());
        existingEmployee.setSalary(employee.getSalary());
        return existingEmployee;
    }

    public boolean deleteEmployee(Long id) {
        DtdEmployee employee = getEmployeeById(id);
        if (employee != null) {
            return employeeList.remove(employee);
        }
        return false;
    }
}
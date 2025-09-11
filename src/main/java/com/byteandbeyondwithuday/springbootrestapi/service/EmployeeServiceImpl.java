package com.byteandbeyondwithuday.springbootrestapi.service;

import com.byteandbeyondwithuday.springbootrestapi.entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final Map<Long, Employee> employeeDB = new LinkedHashMap<>();
    private static Long idCounter = 0L;

    public EmployeeServiceImpl() {
        Employee employee = new Employee(getNextId(), "John", "Doe", 50000.0);
        employeeDB.put(employee.getId(), employee);
    }

    @Override
    public void save(Employee employee) {
        employee.setId(getNextId());
        employeeDB.put(employee.getId(), employee);
    }

    @Override
    public Employee update(Employee employee) {
        checkEmployeeExists(employee.getId());
        employeeDB.put(employee.getId(), employee);
        return employee;
    }


    @Override
    public Employee findById(Long id) {
        checkEmployeeExists(id);
        return employeeDB.get(id);
    }

    @Override
    public void deleteById(Long id) {
        checkEmployeeExists(id);
        employeeDB.remove(id);
    }

    @Override
    public List<Employee> findAll() {
        return employeeDB.values()
                .stream()
                .toList();
    }

    private void checkEmployeeExists(Long id) {
        if (!employeeDB.containsKey(id))
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    private static Long getNextId() {
        return ++idCounter;
    }
}

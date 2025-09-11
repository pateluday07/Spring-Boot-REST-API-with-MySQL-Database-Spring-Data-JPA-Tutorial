package com.byteandbeyondwithuday.springbootrestapi.service;

import com.byteandbeyondwithuday.springbootrestapi.entity.Employee;

import java.util.List;

public interface EmployeeService {

    void save(Employee employee);

    Employee update(Employee employee);

    Employee findById(Long id);

    void deleteById(Long id);

    List<Employee> findAll();
}

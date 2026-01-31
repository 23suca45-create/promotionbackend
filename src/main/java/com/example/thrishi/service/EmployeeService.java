package com.example.thrishi.service;

import com.example.thrishi.entity.Employee;
import com.example.thrishi.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> getAll() {
        return repository.findAll();
    }

    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    public Employee update(Long id, Employee employee) {
        employee.setId(id);
        return repository.save(employee);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

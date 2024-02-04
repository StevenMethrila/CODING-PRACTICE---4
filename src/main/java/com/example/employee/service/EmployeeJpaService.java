/*
 * You can use the following import statements
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.http.HttpStatus;
 * import org.springframework.stereotype.Service;
 * import org.springframework.web.server.ResponseStatusException;
 * import java.util.*;
 */

// Write your code here
package com.example.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.repository.EmployeeJpaRepository;
import com.example.employee.repository.EmployeeRepository;
import com.example.employee.model.Employee;
import java.util.*;

@Service
public class EmployeeJpaService implements EmployeeRepository {
    @Autowired
    EmployeeJpaRepository ejr;

    public ArrayList<Employee> getAll() {
        List<Employee> l = ejr.findAll();
        ArrayList<Employee> arr = new ArrayList<>(l);
        return arr;
    }

}

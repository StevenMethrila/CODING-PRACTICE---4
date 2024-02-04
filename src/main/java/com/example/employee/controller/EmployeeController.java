/*
 * You can use the following import statements
 *
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 */

// Write your code here
package com.example.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeJpaService;
import java.util.*;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeJpaService ejs;

    @GetMapping("/employees")
    public ArrayList<Employee> getMethod() {
        return ejs.getAll();
    }
}

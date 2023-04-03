package com.JavaGuides.springBootBackEnd.controller;

import com.JavaGuides.springBootBackEnd.exception.ResourceNotFoundException;
import com.JavaGuides.springBootBackEnd.model.Employee;
import com.JavaGuides.springBootBackEnd.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = {"http://localhost:3000/"})
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployee(){

        return employeeRepository.findAll();
    }
    //build Create  employee rest api

    @PostMapping
    public Employee createEmployee(@RequestBody  Employee employee){
        return employeeRepository.save(employee);
    }

    //build get employee by  Id rest API
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id){
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:" +id));
        return ResponseEntity.ok(employee);
    }

    //build update employee Rest API
@PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee ( @PathVariable long id, @RequestBody Employee employeeDetails){
        Employee updateEmployee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Emplyee not exit with id: " +id));

        updateEmployee.setFirstName(employeeDetails.getFirstName());
        updateEmployee.setLastName(employeeDetails.getLastName());
        updateEmployee.setEmailId(employeeDetails.getEmailId());

        employeeRepository.save(updateEmployee);
        return  ResponseEntity.ok(updateEmployee);

    }

    //build delete employee Rest API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteEmployee( @PathVariable long id){

        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exit with id: "+id));
        employeeRepository.delete(employee);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}

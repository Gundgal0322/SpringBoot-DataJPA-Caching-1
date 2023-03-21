package com.csi.service;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl {
    @Autowired
    EmployeeDaoImpl employeeDaoImpl;

    public void signUp(Employee employee){
        employeeDaoImpl.signUp(employee);
    }

    public boolean signIn(String empEmailId, String empPassword){
        return employeeDaoImpl.signIn(empEmailId,empPassword);
    }

    public Optional<Employee> getDataById(int  empId){
        return employeeDaoImpl.getDataById(empId);
    }

    public List<Employee> getAllData(){

        return employeeDaoImpl.getAllData();
    }

    public Employee updateDataById(Employee employee){
        return employeeDaoImpl.updateDataById(employee);
    }
    public void deleteDataById(int  empId){
        employeeDaoImpl.deleteDataById(empId);
    }

    public void deleteAllData(){
        employeeDaoImpl.deleteAllData();
    }
}

package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepository employeeRepositoryImpl;

    public void signUp(Employee employee){
        employeeRepositoryImpl.save(employee);
    }

    public boolean signIn(String empEmailId, String empPassword){

        boolean flag = false;

        for (Employee employee : getAllData()) {
            if (employee.getEmpEmailId().equals(empEmailId) && employee.getEmpPassword().equals(empPassword)) {
                flag = true;
            }
        }
        return false;
    }

    public Optional<Employee> getDataById(int  empId){
        return employeeRepositoryImpl.findById(empId);
    }

    public List<Employee> getAllData(){
        return employeeRepositoryImpl.findAll();
    }

    public Employee updateDataById(Employee employee){
        return employeeRepositoryImpl.save(employee);
    }
    public void deleteDataById(int  empId){
        employeeRepositoryImpl.deleteById(empId);
    }

    public void deleteAllData(){
        employeeRepositoryImpl.deleteAll();
    }

}

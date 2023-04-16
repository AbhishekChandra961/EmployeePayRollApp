package com.bridgelabz.EmployeePayRollApp.services;

import com.bridgelabz.EmployeePayRollApp.dto.EmployeeDTO;
import com.bridgelabz.EmployeePayRollApp.model.EmployeeData;

import java.util.List;

public interface IEmployeeServices {
    EmployeeData addEmployee(EmployeeDTO employeeDTO);
    String getEmployeeDetailById(int id);
    List<EmployeeData> getAllEmployees();
    String editEmployeeDetailsById(EmployeeData empList, int id);
    String deleteEmployeeById(int id);
    String deleteAllEmployees();
    List<EmployeeData> getEmployeeDetailByDepartment(String dept);
}
package com.bridgelabz.EmployeePayRollApp.repository;

import com.bridgelabz.EmployeePayRollApp.model.EmployeeData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeData,Integer> {
}

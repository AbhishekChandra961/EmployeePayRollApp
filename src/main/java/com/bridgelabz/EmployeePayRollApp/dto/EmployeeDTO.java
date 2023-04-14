package com.bridgelabz.EmployeePayRollApp.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.ToString;
import lombok.Value;
import org.intellij.lang.annotations.Pattern;

@ToString
public class EmployeeDTO {
    @NotEmpty(message = "Name cannot be empty")
    @Pattern(regexp = "^[A-Z]{1}[A-Za-z]{2,}$", message = "Start Name With Capital Letter")
    public String name;
    @Min(value=500, message="Salary should be greater than 500")
    public double salary;
}

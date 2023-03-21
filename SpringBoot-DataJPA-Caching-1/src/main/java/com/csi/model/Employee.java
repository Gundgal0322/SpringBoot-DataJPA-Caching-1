package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue

    private int empId;

    @Pattern(regexp="[A-Za-z]*", message="Last name should not contain space and special characters")
    private String empFirstName;

    @Size(min = 2, message = "It should contain at  ")
    private String empLastName;

    @NotNull
    private String empAddress;

    @NotNull
    private long empContactNumber;

    @NotNull
    private double empSalary;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date empDOB;

    @Email(message = "please enter a valid Email Id ")
    private String empEmailId;

    @Size(min = 4, message = "Password must contain atleast 4 character")
    private  String empPassword;


}

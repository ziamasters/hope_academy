package com.example.hope_academy.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class EngineeringDepartment {

    //This is the modified class
    
    @Id
    @Column(name = "departmentId")
    private String deptId;

    @Column
    private String departmentName;

    @Column
    private String departmentAddress;

}

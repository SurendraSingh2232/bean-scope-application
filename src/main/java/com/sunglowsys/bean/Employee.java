package com.sunglowsys.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Employee {
    private Long id;
    private String empId;
    private String dept;
    private Double salary;

    public Employee(){
        System.out.println("employee object created");
    }

    public Long getId() {
        return id;
    }

    @Value("100")
    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpId() {
        return empId;
    }
    @Value("1000s")
    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getDept() {
        return dept;
    }
    @Value("devolopment")
    public void setDept(String dept) {
        this.dept = dept;
    }

    public Double getSalary() {
        return salary;
    }
    @Value("10000")
    public void setSalary(Double salary) {
        this.salary = salary;
    }

}

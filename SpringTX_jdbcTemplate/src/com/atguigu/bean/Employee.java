package com.atguigu.bean;

public class Employee {
    private Integer emId;
    private String empName;
    private Double salary;

    public Employee(Integer emId, String empName, Double salary) {
        this.emId = emId;
        this.empName = empName;
        this.salary = salary;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emId=" + emId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Integer getEmId() {
        return emId;
    }

    public void setEmId(Integer emId) {
        this.emId = emId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

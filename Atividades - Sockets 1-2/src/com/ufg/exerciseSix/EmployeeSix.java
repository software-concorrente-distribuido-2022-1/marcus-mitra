package com.ufg.exerciseSix;

public class EmployeeSix {

    private String employeeName;
    private EmployeeLevel employeeLevel;
    private double employeeSalary;
    private int employeeDependents;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public EmployeeLevel getEmployeeLevel() {
        return employeeLevel;
    }

    public void setEmployeeLevel(EmployeeLevel employeeLevel) {
        this.employeeLevel = employeeLevel;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeDependents() {
        return employeeDependents;
    }

    public void setEmployeeDependents(int employeeDependents) {
        this.employeeDependents = employeeDependents;
    }

    public EmployeeSix(String employeeName, EmployeeLevel employeeLevel, double employeeSalary, int employeeDependents) {
        this.employeeName = employeeName;
        this.employeeLevel = employeeLevel;
        this.employeeSalary = employeeSalary;
        this.employeeDependents = employeeDependents;
    }
}

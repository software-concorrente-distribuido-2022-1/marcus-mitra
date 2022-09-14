package com.ufg.exerciseSeven;

public class EmployeeSeven {

    private String employeeName;
    private int employeeAge;
    private int employeeYearsWorked;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public int getEmployeeYearsWorked() {
        return employeeYearsWorked;
    }

    public void setEmployeeYearsWorked(int employeeYearsWorked) {
        this.employeeYearsWorked = employeeYearsWorked;
    }

    public EmployeeSeven(String employeeName, int employeeAge, int employeeYearsWorked) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeYearsWorked = employeeYearsWorked;
    }

}

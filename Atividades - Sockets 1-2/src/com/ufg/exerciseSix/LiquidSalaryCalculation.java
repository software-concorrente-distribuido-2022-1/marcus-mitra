package com.ufg.exerciseSix;

public class LiquidSalaryCalculation {

    public static void liquidSalaryCalculation(EmployeeSix employee) {
        double salaryLiquid;
        switch (employee.getEmployeeLevel()) {
            case A:
                if (employee.getEmployeeDependents() == 0) {
                    salaryLiquid = employee.getEmployeeSalary() - (employee.getEmployeeSalary() * 0.03);
                    System.out.println(employee.getEmployeeName() + "'s liquid salary is: R$" + salaryLiquid + "\n");
                }
                else {
                    salaryLiquid = employee.getEmployeeSalary() - (employee.getEmployeeSalary() * 0.08);
                    System.out.println(employee.getEmployeeName() + "'s liquid salary is: R$" + salaryLiquid + "\n");
                }
                break;
            case B:
                if (employee.getEmployeeDependents() == 0) {
                    salaryLiquid = employee.getEmployeeSalary() - (employee.getEmployeeSalary() * 0.05);
                    System.out.println(employee.getEmployeeName() + "'s liquid salary is: R$" + salaryLiquid + "\n");
                }
                else {
                    salaryLiquid = employee.getEmployeeSalary() - (employee.getEmployeeSalary() * 0.10);
                    System.out.println(employee.getEmployeeName() + "'s liquid salary is: R$" + salaryLiquid + "\n");
                }
                break;
            case C:
                if (employee.getEmployeeDependents() == 0) {
                    salaryLiquid = employee.getEmployeeSalary() - (employee.getEmployeeSalary() * 0.08);
                    System.out.println(employee.getEmployeeName() + "'s liquid salary is: R$" + salaryLiquid + "\n");
                }
                else {
                    salaryLiquid = employee.getEmployeeSalary() - (employee.getEmployeeSalary() * 0.15);
                    System.out.println(employee.getEmployeeName() + "'s liquid salary is: R$" + salaryLiquid + "\n");
                }
                break;
            case D:
                if (employee.getEmployeeDependents() == 0) {
                    salaryLiquid = employee.getEmployeeSalary() - (employee.getEmployeeSalary() * 0.10);
                    System.out.println(employee.getEmployeeName() + "'s liquid salary is: R$" + salaryLiquid + "\n");
                }
                else {
                    salaryLiquid = employee.getEmployeeSalary() - (employee.getEmployeeSalary() * 0.17);
                    System.out.println(employee.getEmployeeName() + "'s liquid salary is: R$" + salaryLiquid + "\n");
                }
                break;
        }
    }
}

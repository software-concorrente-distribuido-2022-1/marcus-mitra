package com.ufg.exerciseOne;

public class ReadjustSalary {

    public static void readjustSalary(Employee employee) {
        double oldSalary = employee.getEmployeeSalary();
        double newSalary;
        if (employee.getEmployeePosition() == EmployeePosition.OPERATOR){
            newSalary = (oldSalary * 1.2);
            employee.setEmployeeSalary(newSalary);
            System.out.println(employee.getEmployeeName()+"'s salary before readjustment: " + oldSalary +".\n"
                    +employee.getEmployeeName()+"'s salary after readjustment: "+ newSalary + "\n" );
        } else {
            newSalary = (oldSalary * 1.18);
            employee.setEmployeeSalary(newSalary);
            System.out.println(employee.getEmployeeName()+"'s salary before readjustment: " + oldSalary +".\n"
                    +employee.getEmployeeName()+"'s salary after readjustment: "+ newSalary + "\n" );
        }
    }

}

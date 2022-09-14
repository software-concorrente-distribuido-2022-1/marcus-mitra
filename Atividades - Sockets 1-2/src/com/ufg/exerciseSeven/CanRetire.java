package com.ufg.exerciseSeven;

public class CanRetire {

//  Considere que um funcionário só pode se aposentar se todas as condições abaixo forem satisfeitas:
//  Ter no mínimo 65 anos de idade;
//  Ter trabalhado, no mínimo, 30 anos;
//  Ter no mínimo 60 anos de idade e ter trabalhado no mínimo 25 anos.

//  Já que é a combinação de TODOS esses fatores. Só me sobrou a opção de calcular se ele tem 65 anos ou mais e se ele trabalhou 30 anos ou mais!

    public static void canRetire(EmployeeSeven employee) {
        if (employee.getEmployeeAge() >= 65 && employee.getEmployeeYearsWorked() >= 30) {
            System.out.println(employee.getEmployeeName() + " can retire from working!");
        } else {
            System.out.println(employee.getEmployeeName() + " can't retire from working yet!");
        }
    }
}

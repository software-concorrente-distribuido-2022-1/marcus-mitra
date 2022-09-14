package com.ufg;

import com.ufg.exerciseEight.Customer;
import com.ufg.exerciseEight.SpecialCredit;
import com.ufg.exerciseFive.SortCategories;
import com.ufg.exerciseFive.Swimmer;
import com.ufg.exerciseFour.IdealWeight;
import com.ufg.exerciseFour.PersonExFour;
import com.ufg.exerciseNine.PlayingCard;
import com.ufg.exerciseOne.Employee;
import com.ufg.exerciseOne.EmployeePosition;
import com.ufg.exerciseOne.ReadjustSalary;
import com.ufg.exerciseSeven.CanRetire;
import com.ufg.exerciseSeven.EmployeeSeven;
import com.ufg.exerciseSix.EmployeeLevel;
import com.ufg.exerciseSix.EmployeeSix;
import com.ufg.exerciseSix.LiquidSalaryCalculation;
import com.ufg.exerciseThree.GradeCalculation;
import com.ufg.exerciseThree.Student;
import com.ufg.exerciseTwo.IsPersonOfAge;
import com.ufg.exerciseTwo.Person;
import com.ufg.exerciseTwo.PersonSex;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Exercise One
        System.out.println("Exercise One started:");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", EmployeePosition.OPERATOR, 1500));
        employeeList.add(new Employee("Kurt", EmployeePosition.OPERATOR, 3000));
        employeeList.add(new Employee("Mary", EmployeePosition.PROGRAMMER, 1500));
        employeeList.add(new Employee("Helen", EmployeePosition.PROGRAMMER, 3000));

        employeeList.forEach(ReadjustSalary::readjustSalary);
        System.out.println("Exercise One finished. \n");
        //End of Exercise One

        //Exercise Two
        System.out.println("Exercise Two started:");
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John", PersonSex.MALE, 34));
        personList.add(new Person("Kurt", PersonSex.MALE, 17));
        personList.add(new Person("Mary", PersonSex.FEMALE, 25));
        personList.add(new Person("Helen", PersonSex.FEMALE, 19));

        personList.forEach(IsPersonOfAge::isPersonOfAge);
        System.out.println("Exercise Two finished. \n");
        //End of Exercise Two

        //Exercise Three
        System.out.println("Exercise Three started:");
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", 9, 10, 9.7));
        studentList.add(new Student("Kurt", 4.5, 5, 6.8));
        studentList.add(new Student("Mary", 5, 5, 2.7));
        studentList.add(new Student("Helen", 1, 1.7, 10));

        studentList.forEach(GradeCalculation::gradeCalculation);
        System.out.println("Exercise Three finished. \n");
        //End of Exercise Three

        //Exercise Four
        System.out.println("Exercise Four started:");
        List<PersonExFour> personExFourList = new ArrayList<>();
        personExFourList.add(new PersonExFour("John", 1.80, PersonSex.MALE));
        personExFourList.add(new PersonExFour("Kurt", 1.60, PersonSex.MALE));
        personExFourList.add(new PersonExFour("Mary", 1.45, PersonSex.FEMALE));
        personExFourList.add(new PersonExFour("Helen", 1.70, PersonSex.FEMALE));

        personExFourList.forEach(IdealWeight::idealWeight);
        System.out.println("Exercise Four finished. \n");
        //End of Exercise Four

        //Exercise Five
        System.out.println("Exercise Five started:");
        List<Swimmer> swimmerList = new ArrayList<>();
        swimmerList.add(new Swimmer("John", 4));
        swimmerList.add(new Swimmer("Kurt", 7));
        swimmerList.add(new Swimmer("Mary", 9));
        swimmerList.add(new Swimmer("Helen", 11));
        swimmerList.add(new Swimmer("Matthew", 15));
        swimmerList.add(new Swimmer("Sam", 57));

        swimmerList.forEach(SortCategories::sortCategories);
        System.out.println("Exercise Five finished. \n");
        //End of Exercise Five

        //Exercise Six
        System.out.println("Exercise Six started:");
        List<EmployeeSix> employeeSixList = new ArrayList<>();
        employeeSixList.add(new EmployeeSix("John", EmployeeLevel.A, 2000, 3));
        employeeSixList.add(new EmployeeSix("Kurt", EmployeeLevel.B, 3000, 0));
        employeeSixList.add(new EmployeeSix("Mary", EmployeeLevel.C, 4000, 1));
        employeeSixList.add(new EmployeeSix("Helen", EmployeeLevel.D, 5000, 0));

        employeeSixList.forEach(LiquidSalaryCalculation::liquidSalaryCalculation);
        System.out.println("Exercise Six finished. \n");
        //End of Exercise Six

        //Exercise Seven
        System.out.println("Exercise Seven started:");
        List<EmployeeSeven> employeeSevenList = new ArrayList<>();
        employeeSevenList.add(new EmployeeSeven("John", 65, 30));
        employeeSevenList.add(new EmployeeSeven("Kurt", 70, 25));
        employeeSevenList.add(new EmployeeSeven("Mary", 55, 35));
        employeeSevenList.add(new EmployeeSeven("Helen", 50, 20));

        employeeSevenList.forEach(CanRetire::canRetire);
        System.out.println("Exercise Seven finished. \n");
        //End of Exercise Seven

        //Exercise Eight
        System.out.println("Exercise Eight started:");
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("John", 199));
        customerList.add(new Customer("Kurt", 370));
        customerList.add(new Customer("Mary", 600));
        customerList.add(new Customer("Helen", 601));

        customerList.forEach(SpecialCredit::specialCredit);
        System.out.println("Exercise Eight finished. \n");
        //End of Exercise Eight

        //Exercise Nine
        System.out.println("Exercise Nine started:");
        List<PlayingCard> playingCardList = new ArrayList<>();
        playingCardList.add(new PlayingCard(1,1));
        playingCardList.add(new PlayingCard(10,2));
        playingCardList.add(new PlayingCard(11,3));
        playingCardList.add(new PlayingCard(12,4));
        playingCardList.add(new PlayingCard(13,1));

        playingCardList.forEach(playingCard -> System.out.println(playingCard.toString()));
        System.out.println("Exercise Nine finished. \n");
        //End of Exercise Nine
    }
}

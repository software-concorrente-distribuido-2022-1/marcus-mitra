package com.ufg.exerciseThree;

public class GradeCalculation {

    public static void gradeCalculation(Student student) {
        double averageGradeN1N2 = ((student.getStudentGradeN1() + student.getStudentGradeN2()) / 2);
        double averageGrade = ((student.getStudentGradeN1() + student.getStudentGradeN2() + student.getStudentGradeN3()) / 3);
        if (averageGradeN1N2 >= 7) {
            System.out.println("The student "+ student.getStudentName() + " has been approved and doesn't need to take the N3 test! \n");
        }
        else {
            if (averageGradeN1N2 > 3) {
                System.out.println("The student "+ student.getStudentName() + " needs take the N3 test.");
                if (averageGrade >= 5) {
                    System.out.println("The student "+ student.getStudentName() + " has been approved after taking the N3 test! \n");
                } else {
                    System.out.println("The student "+ student.getStudentName() + " has failed even after the N3 test! \n");
                }
            }
            else {
                System.out.println("The student "+ student.getStudentName() + " has failed! \n");
            }
        }
    }

}

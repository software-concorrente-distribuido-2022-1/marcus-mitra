package com.ufg.exerciseThree;

public class Student {

    private String studentName;
    private double studentGradeN1;
    private double studentGradeN2;
    private double studentGradeN3;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getStudentGradeN1() {
        return studentGradeN1;
    }

    public void setStudentGradeN1(double studentGradeN1) {
        this.studentGradeN1 = studentGradeN1;
    }

    public double getStudentGradeN2() {
        return studentGradeN2;
    }

    public void setStudentGradeN2(double studentGradeN2) {
        this.studentGradeN2 = studentGradeN2;
    }

    public double getStudentGradeN3() {
        return studentGradeN3;
    }

    public void setStudentGradeN3(double studentGradeN3) {
        this.studentGradeN3 = studentGradeN3;
    }

    public Student(String studentName, double studentGradeN1, double studentGradeN2, double studentGradeN3) {
        this.studentName = studentName;
        this.studentGradeN1 = studentGradeN1;
        this.studentGradeN2 = studentGradeN2;
        this.studentGradeN3 = studentGradeN3;
    }
}

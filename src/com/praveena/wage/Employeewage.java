package com.praveena.wage;

public class Employeewage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int empRatePerHr = 20;
    public static void main(String[] args) {
        int salary=0;
        int empHrs=0;
        int empcheck =(int) Math.floor(Math.random() * 10) % 3;
        switch(empcheck){
            case IS_FULL_TIME:
                System.out.println("Employee is fulltime present");
                empHrs = 8;
                break;
            case IS_PART_TIME:
                System.out.println("Employee is parttime");
                empHrs = 4;
                break;
            default:
                System.out.println("Employee is absent");
                empHrs = 0;
                break;
        }
        salary = empHrs * empRatePerHr;
        System.out.println("salary is " +salary);
    }
}
package com.praveena.wage;

public class Employeewage {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage program");
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int empRatePerHr = 20;
        int salary;
        int empHrs;
        double empcheck = Math.floor(Math.random() * 10) % 3;
        if (empcheck ==  IS_FULL_TIME) {
            System.out.println("Employee is fulltime present");
            empHrs = 8;
        }
        else if (empcheck == IS_PART_TIME){
            System.out.println("Employee is parttime");
            empHrs = 4;
        }
        else {
            System.out.println("Employee is absent");
            empHrs = 0;
        }
        salary = empHrs * empRatePerHr;
        System.out.println("salary is " +salary);
    }
}
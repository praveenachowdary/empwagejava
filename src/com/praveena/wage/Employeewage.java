package com.praveena.wage;

public class Employeewage {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage program");
        int IS_FULL_TIME = 1;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck ==  IS_FULL_TIME) {
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }
}
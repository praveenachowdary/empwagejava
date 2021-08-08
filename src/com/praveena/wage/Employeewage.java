package com.praveena.wage;

public class Employeewage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static void main(String[] args) {
        int empHrs = 0;
        int salary = 0;
        int totalsalarymonth = 0;
        for (int day = 1; day <= NUM_OF_WORKING_DAYS; day++)
        {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch(empCheck)
            {
                case IS_PART_TIME:
                    empHrs = 4;
                    System.out.println("parttime");
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    System.out.println("fulltime");
                    break;
                default:
                    empHrs = 0;
                    System.out.println("absent");
            }
            salary = empHrs * EMP_RATE_PER_HOUR;
            System.out.println("salary: "+ salary);
            totalsalarymonth=totalsalarymonth+salary;
        }
        System.out.println("Total salary for month: " + totalsalarymonth);
    }
}
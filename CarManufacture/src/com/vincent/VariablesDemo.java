package com.vincent;

import java.util.Scanner;

public class VariablesDemo {

    int empid;
    char gender;
    float allowance;
    double basicSalary;
    Scanner src = new Scanner(System.in);

    public void setEmployeeId(int empid)
    {
        System.out.println("Enter the Employee id");
        this.empid= src.nextInt();
    }
    public void setEmployeeGender(char gender)
    {
        System.out.println("Enter the Employee gender");
        String gender_type=src.next();
        this.gender= gender_type.charAt(0);
    }
    public void setEmployeeAllowance(float allowance)
    {
        System.out.println("Enter the Employee allowance");
        this.allowance= src.nextFloat();
    }
    public void setEmployeeBasicSalary(double basicSalary)
    {
        System.out.println("Enter the Employee basic Salary");
        this.basicSalary= src.nextDouble();
    }


}
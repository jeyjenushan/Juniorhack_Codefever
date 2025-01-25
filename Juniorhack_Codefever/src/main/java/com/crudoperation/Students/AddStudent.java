package com.crudoperation.Students;

import java.util.Scanner;

public class AddStudent implements StudentOperation{
    Scanner scanner=new Scanner(System.in);
    @Override
   public void operation() {
        System.out.println("Add a student...");
        System.out.println("/n/n");
        System.out.println("Add the name : ");
        String studentName=scanner.nextLine();
        System.out.println("Add the studentId(eg: abc001) : ");
        String studentId=scanner.nextLine();
        System.out.println("Add the age : ");
        int age=scanner.nextInt();
        System.out.println("Add the department  : ");
        String department=scanner.nextLine();




    }
}

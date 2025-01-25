package com.crudoperation.Students;

import java.util.Scanner;

public class RemoveStudent implements StudentOperation{
    Scanner scanner=new Scanner(System.in);
    @Override
    public void operation() {
        System.out.println("Removing a student...\n\n");
        System.out.println("Student Id(eg:abc001) : \n");
        String id=scanner.nextLine();
        System.out.println("Do you want to remove student (y/n)? : ");
        String opinion=scanner.next();



    }
}

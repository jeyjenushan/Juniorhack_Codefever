package com.crudoperation.StudentAllocation;

import java.util.Scanner;

public class StudentAllocationService {
    public void serviceProvider(){
        System.out.println("Student Allocation Manahement..");
        Scanner scanner=new Scanner(System.in);

        int choice=scanner.nextInt();
        System.out.println("[1] Alloacate a Room to a Student");
        System.out.println("[2] Delete an Allocation");
        System.out.println("[3] View an Allocation");
        System.out.println("[0] Main Menu");

        switch (choice){
            case 1:


        }
    }
}

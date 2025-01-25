package com.crudoperation.Students;

import java.util.Scanner;

public class UpdateStudent implements StudentOperation{
    Scanner scanner=new Scanner(System.in);
    @Override
    public void operation() {
        System.out.println("Update student...\n\n");
        System.out.println("Student Id(eg:abc001) : \n");
        String id=scanner.nextLine();

        System.out.println("Enter the attribute to update[1-name,2-age,3-department] : ");
        int attributeOpinion=scanner.nextInt();
        switch (attributeOpinion){
            case 1:
                System.out.println("New value : ");
                String newName=scanner.nextLine();
                break;
            case 2:
                System.out.println("New value : ");
                int newAge=scanner.nextInt();
                break;
            case 3:
                System.out.println("New value : ");
                String newDepartment=scanner.nextLine();
                break;

        }


    }
}

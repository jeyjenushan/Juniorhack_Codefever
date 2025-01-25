package com.crudoperation.Students;


import com.crudoperation.DatabaseManagement.dbconnect;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentManagementServices {
    static Scanner scanner=new Scanner(System.in);
    public static StudentOperation callingServices() throws SQLException {
        while(true){
        System.out.println("Student Management...");
            System.out.println();

        System.out.println("[1] Add Student");
        System.out.println("[2] Remove Student");
        System.out.println("[3] Update Student");
        System.out.println("[4] View Student Details");
        System.out.println("[0] Main menu");
        String value=scanner.nextLine();
        StudentOperation studentOperation=null;

        while(true){
            switch (value){
                case "1":
                      studentOperation=new AddStudent();
                    studentOperation.operation(dbconnect.getConnection());
                    break;
                case "2":
                    studentOperation=new RemoveStudent();
                    studentOperation.operation(dbconnect.getConnection());
                    break;
                case "3":
                    studentOperation=new UpdateStudent();
                    studentOperation.operation(dbconnect.getConnection());
                    break;
                case "4":
                    studentOperation=new ViewStudent();
                    studentOperation.operation(dbconnect.getConnection());

            }
        }


    }
}}

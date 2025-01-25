package com.crudoperation;

import com.crudoperation.DatabaseManagement.dbconnect;
import com.crudoperation.Hotels.HotelManage;
import com.crudoperation.StudentAllocation.StudentAllocationManage;

import com.crudoperation.Students.StudentManagementServices;
import com.crudoperation.Students.StudentOperation;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("----------Welcome to the Hostel Management System ---------");
        System.out.println("------ABC University");
        System.out.println("please enter the number of the action you want to proceed");
        System.out.println("(1) Manage Hostel");
        System.out.println("(2) Manage Students");
        System.out.println("(3) Manage Student Allocation");
        System.out.println("(4) Exit");


            try (Connection conn = dbconnect.getConnection()) {
                System.out.println("Connected successfully");

            }
            catch (SQLException e) {
                System.err.println("Error occurred: " + e.getMessage());
    }

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the number of the action you want to proceed");
        int action= scanner.nextInt();
       while(action!=4)
       {
           switch (action){
               case 1:
               case 2:
                   StudentOperation studentOperation=StudentManagementServices.callingServices();
                   studentOperation.operation(dbconnect.getConnection());
               case 3:
                   StudentAllocationManage studentAllocationManage= new StudentAllocationManage();
               case 4:
                   System.exit(0);
           }
       }
    }
}
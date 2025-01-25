package com.crudoperation;

import com.crudoperation.Hotels.HostelServices;
import com.crudoperation.Hotels.HotelManage;
import com.crudoperation.StudentAllocation.StudentAllocationManage;
import com.crudoperation.Students.StudentManage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------Welcome to the Hostel Management System ---------");
        System.out.println("------ABC University");
        System.out.println("please enter the number of the action you want to proceed");
        System.out.println("(1) Manage Hostel");
        System.out.println("(2) Manage Students");
        System.out.println("(3) Manage Student Allocation");
        System.out.println("(4) Exit");

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the number of the action you want to proceed");
        int action= scanner.nextInt();
        switch (action){
            case 1:
                HostelServices hostelServices= new HostelServices();
                hostelServices.hotelServiceDisplay();

              case 2:

                case 3:
                    StudentAllocationManage studentAllocationManage= new StudentAllocationManage();
                    case 4:
                        System.exit(0);
        }
    }
}
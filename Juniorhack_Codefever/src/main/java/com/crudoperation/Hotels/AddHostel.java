package com.crudoperation.Hotels;

import java.util.Scanner;

public class AddHostel implements HostelOperation {

    @Override
    public void operation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the hostelId");
        String hostelId = sc.nextLine();
        System.out.println("Enter the name of the hoste Name");
        String hosteName = sc.nextLine();
        System.out.println("Enter the NumberOfRooms of the hostel");
        int numberOfRooms = sc.nextInt();

//        try{
//
//        }catch{
//
//        }
//    }
    }
}

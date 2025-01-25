package com.crudoperation.Hotels;

import java.util.Scanner;

public  class HostelServices {
    public static void hotelServiceDisplay(){
        System.out.println("Hostel Mnagement");
        System.out.println("(1)Add a Hostel");
        System.out.println("(2)Update Hostel Information");
        System.out.println("(3)View Hostel Details");
        System.out.println("(4)Romms Management");
        System.out.println("(5)Main Menu");

        System.out.println("Enter your choice");
        Scanner sc = new Scanner(System.in);
//        jhjs
        int HostelServicechoice = sc.nextInt();
        switch (HostelServicechoice) {
            case 1:
                 AddHostel addHostel = new AddHostel();
                 addHostel.operation();
                case 2:
                    case 3:
                        case 4:
                            case 5:
        }
    }

}

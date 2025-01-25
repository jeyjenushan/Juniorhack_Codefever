package com.crudoperation.Hotels;

import com.crudoperation.DatabaseManagement.dbconnect;
import com.crudoperation.Room.RoomService;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class HostelServices {
    public  void hotelServiceDisplay() throws SQLException {
        System.out.println("Hostel Mnagement");
        System.out.println("(1)Add a Hostel");
        System.out.println("(2)Update Hostel Information");
        System.out.println("(3)View Hostel Details");
        System.out.println("(4)Rooms Management");
        System.out.println("(5)Main Menu");

        System.out.println("Enter your choice");
        Scanner sc = new Scanner(System.in);

        int HostelServicechoice = sc.nextInt();

        switch (HostelServicechoice) {
            case 1:
                AddHostel addHostel = new AddHostel();
                addHostel.operation(dbconnect.getConnection());
                break;

                case 2:
                    UpdateHostel updateHostel = new UpdateHostel();

                    updateHostel.operation(dbconnect.getConnection());
                    break;
                    case 3:
                        HostelDetailsDisplay hostelDetailsDisplay = new HostelDetailsDisplay();
                        hostelDetailsDisplay.operation(dbconnect.getConnection());
                        break;
                        case 4:
                            RoomService roomService = new RoomService();
                            roomService.operation(dbconnect.getConnection());
                            break;

                            case 5:
                                return;
        }
    }

}

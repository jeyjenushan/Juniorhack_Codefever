package com.crudoperation.Room;

import java.util.Scanner;

public class RoomService implements RoomOperation{
    @Override
    public void operation() {
         System.out.println("Roomoperation");
        System.out.println("(1).Add Rooms");
        System.out.println("(2).View Rooms");
        System.out.println("(3).Update Rooms");
        System.out.println("(4).Delete Rooms");
        System.out.println("(5).Back to Previous");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the choise you want");
        int roomChoice = scanner.nextInt();

        switch (roomChoice) {
            case 1:
            case 2:
                case 3:
                    case 4:
                        case 5:

        }
    }
}

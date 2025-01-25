package com.crudoperation.Room;

import java.util.Scanner;

public class AddRoom implements RoomOperation {
    @Override
    public void operation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name Id");
        String roomId = sc.nextLine();
        System.out.println("Enter the hostelId");
        String hostelId = sc.nextLine();
        System.out.println("Enter the roomNumber");
        String roomNumber = sc.nextLine();
        System.out.println("Enter the capacity");
        int capacity = sc.nextInt();
        System.out.println("Enter the availableCapacity");
        int availableCapacity = sc.nextInt();

    }
}

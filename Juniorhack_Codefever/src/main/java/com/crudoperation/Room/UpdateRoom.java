package com.crudoperation.Room;

import java.sql.Connection;
import java.util.Scanner;

public class UpdateRoom implements RoomOperation{
    public void operation(Connection conn) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the roomId");
        String roomId = sc.nextLine();

    }
}

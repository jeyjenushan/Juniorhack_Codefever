package com.crudoperation.Room;

import java.sql.Connection;
import java.util.Scanner;

public class DeleteRoom implements RoomOperation{
    public void operation(Connection conn) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the room Id");
        int roomId = sc.nextInt();
    }
}

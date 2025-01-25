package com.crudoperation.Room;

import java.util.Scanner;

public class DeleteRoom implements RoomOperation{
    public void operation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the room Id");
        int roomId = sc.nextInt();
    }
}

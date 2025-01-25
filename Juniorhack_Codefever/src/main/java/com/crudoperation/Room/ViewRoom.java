package com.crudoperation.Room;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ViewRoom implements RoomOperation {
     public void operation() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the hostelId");
         String hostelId = sc.nextLine();
     }

}

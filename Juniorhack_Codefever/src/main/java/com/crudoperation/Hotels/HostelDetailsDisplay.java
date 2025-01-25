package com.crudoperation.Hotels;

import org.w3c.dom.ls.LSOutput;

import java.sql.Connection;
import java.util.Scanner;

public class HostelDetailsDisplay implements HostelOperation {
      public void operation(Connection conn){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Hostel ID: ");
          String hostelID = sc.nextLine();

      }

}

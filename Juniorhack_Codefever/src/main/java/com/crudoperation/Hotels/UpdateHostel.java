package com.crudoperation.Hotels;

import java.sql.Connection;
import java.util.Scanner;

public class UpdateHostel implements HostelOperation {
    public void operation(Connection conn) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hostel ID");
        int id = sc.nextInt();

    }
}

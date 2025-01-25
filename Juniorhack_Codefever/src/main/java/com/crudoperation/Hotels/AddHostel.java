package com.crudoperation.Hotels;

import jdk.dynalink.Operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddHostel implements HostelOperation {

    @Override
    public void operation(Connection conn) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the hostelId");
        String hostelId = sc.nextLine();
        System.out.println("Enter the name of the hoste Name");
        String hosteName = sc.nextLine();
        System.out.println("Enter the NumberOfRooms of the hostel");
        int numberOfRooms = sc.nextInt();

        String sql = "INSERT INTO employees VALUES (hostelId,hostelName,numberOfRooms)";
        try (PreparedStatement preparedStatement = conn.prepareStatement(sql);) {

            preparedStatement.setString(1, hostelId);
            preparedStatement.setString(2, hosteName);
            preparedStatement.setInt(3, numberOfRooms);


            int res = preparedStatement.executeUpdate(); // can use  preparedStatement.executeUpdate();

            if (res > 0) {
//                return "Successfully added the record of the employee Id: " + hostelId;
            } else {
//                return "Registering employee is unsuccessful!";
            }
        } catch (SQLException e) {
//            return "Registering employee is unsuccessful! Reason: " + e.getMessage();
        }


    }
}

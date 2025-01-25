package com.crudoperation.StudentAllocation;

import com.sun.jdi.connect.spi.Connection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AllocatingToStudent implements StudentAllocationOperation {


    @Override
    public void Operation(java.sql.Connection conn) {


            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the allocation id");
            int allocation_id=scanner.nextInt();
            System.out.println("Enter the student id");
            String student_id=scanner.nextLine();
            System.out.println("Enter the room id");
            String room_id=scanner.nextLine();
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String dateInput = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

                    LocalDate date = LocalDate.parse(dateInput, formatter);

            String sql = "INSERT INTO Allocation (allocation_id,student_id,room_id,allocation_date)VALUES (?,?,?,?)";
            try(PreparedStatement preparedStatement = conn.prepareStatement(sql)) {

                preparedStatement.setInt(1,allocation_id);
                preparedStatement.setString(2,student_id);
                preparedStatement.setString(3,room_id);
                preparedStatement.setDate(4, Date.valueOf(date));

                int res = preparedStatement.executeUpdate(); // can use  preparedStatement.executeUpdate();

                if (res>0) {
                    System.out.println("Successfully added the record : " + allocation_id);
                } else {
                    System.out.println("Registering allocation is unsuccessful!");
                }
            }

            catch (SQLException e){
                System.out.println("Registering unsuccessful! Reason: "+ e.getMessage());
            }

        }
//asih
    }


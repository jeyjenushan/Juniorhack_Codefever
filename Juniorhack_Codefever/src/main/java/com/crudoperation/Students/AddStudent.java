package com.crudoperation.Students;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddStudent implements StudentOperation{
    Scanner scanner=new Scanner(System.in);
    @Override
   public void operation(Connection con) {


        System.out.println("Add a student...");
        System.out.println();

        System.out.println("Add the name : ");
        String studentName=scanner.nextLine();
        System.out.println("Add the studentId(eg: abc001) : ");
        String studentId=scanner.nextLine();
        System.out.println("Add the age : ");
        int age=scanner.nextInt();
        System.out.println("Add the department  : ");
        scanner.nextLine();
        String department=scanner.nextLine();



        String sql = "INSERT INTO students (student_id,name,age,department )VALUES (?,?,?,?)";
        try(PreparedStatement preparedStatement = con.prepareStatement(sql);) {

            preparedStatement.setString(1,studentId);
            preparedStatement.setString(2,studentName);
            preparedStatement.setInt(3,age);
            preparedStatement.setString(4,department);

            int res = preparedStatement.executeUpdate(); // can use  preparedStatement.executeUpdate();

            if (res>0) {
                System.out.println("Successfully added the record of the employee Id: " + studentId);
                return;
            } else {
                System.out.println("Registering employee is unsuccessful!");
            }
        }
        catch (SQLException e){
            System.out.println( "Registering employee is unsuccessful! Reason: "+ e.getMessage());
        }






    }
}

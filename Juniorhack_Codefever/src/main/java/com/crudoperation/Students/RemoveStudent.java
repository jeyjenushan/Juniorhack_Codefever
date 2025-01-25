package com.crudoperation.Students;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class RemoveStudent implements StudentOperation{
    Scanner scanner=new Scanner(System.in);
    @Override
    public void operation(Connection conn) {
        System.out.println("Removing a student...\n\n");
        System.out.println("Student Id(eg:abc001) : \n");
        String id=scanner.nextLine();
        System.out.println("Do you want to remove student (y/n)? : ");
        String opinion=scanner.next();

        String sql = "DELETE FROM employees WHERE employee_id = ?";
        try(PreparedStatement preparedStatement = conn.prepareStatement(sql);) {

            preparedStatement.setString(1,id);

            int row = preparedStatement.executeUpdate();
            if (row > 0) {
                System.out.println( "Successfully deleted the record of the employee Id: " + id);
            }
            else if (row == 0) {
                System.out.println("Given employee is not found!");
            }
            else{
                System.out.println( "Deleting employee is unsuccessful!");
            }
        }
        catch ( SQLException e){
            System.out.println( "Deleting employee is unsuccessful! Reason: "+ e.getMessage());
        }}





    }


package com.crudoperation.StudentAllocation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteAlocation implements StudentAllocationOperation {


    @Override
    public void Operation(Connection conn) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter which student one going to delete");
        String id=scanner.nextLine();

        String sql = "DELETE FROM Allocation WHERE student_id = ?";
        try(PreparedStatement preparedStatement = conn.prepareStatement(sql);) {

            preparedStatement.setString(1,id);

            int row = preparedStatement.executeUpdate();
            if (row > 0) {
                System.out.println( "Successfully deleted the record of the Student Id: " + id);
            }
            else if (row == 0) {
                System.out.println( "Given Student is not found!");
            }
            else{
                System.out.println("Deleting Student Allocation is unsuccessful!");
            }
        }
        catch (SQLException e){
            System.out.println("Deleting Student Allocation is unsuccessful! Reason: "+ e.getMessage());
        }
    }


}

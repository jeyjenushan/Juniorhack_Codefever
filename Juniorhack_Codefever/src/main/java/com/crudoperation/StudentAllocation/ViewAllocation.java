package com.crudoperation.StudentAllocation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
//fss
public class ViewAllocation implements StudentAllocationOperation{
    @Override
    public void Operation(Connection Conn) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter which Allocationid details going to view");
       int id=scanner.nextInt();


        String sql = "SELECT * FROM Allocation WHERE allocation_id = ?;";
        StringBuilder result = new StringBuilder();

        try(PreparedStatement preparedStatement = Conn.prepareStatement(sql)) {
            preparedStatement.setInt(1,id);
            ResultSet res = preparedStatement.executeQuery();

            if (res.next()){
                String empId = res.getString("employee_id");
                String name = res.getString("name");
                int age = res.getInt("age");
                String department = res.getString("department");
                System.out.println(String.format("ID: %s, Name: %s, Age: %d, Department: %s\n", id, name, age, department));

            } else {
                System.out.println("employee records are empty!");
            }
        }
        catch (SQLException e){
            System.out.println("Retrieving details unsuccessful! Reason: "+ e.getSQLState());
        }
    }


}


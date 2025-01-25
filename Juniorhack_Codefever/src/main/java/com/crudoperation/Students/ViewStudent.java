package com.crudoperation.Students;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ViewStudent implements StudentOperation{
    Scanner scanner=new Scanner(System.in);

    @Override
    public void operation(Connection conn) {
        System.out.println("View Student details.../n/n");
        System.out.println("Enter the student Id : ");
        String id=scanner.nextLine();
        String sql = "SELECT * FROM employees WHERE student_id = ?;";
        StringBuilder result = new StringBuilder();
        try(PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setString(1,id);
            ResultSet res = preparedStatement.executeQuery();

            if (res.next()){
                String studentId = res.getString("student_id");
                String name = res.getString("name");
                int age = res.getInt("age");
                String department = res.getString("department");
                System.out.println(String.format("ID: %s, Name: %s, Age: %d, Department: %s\n", studentId, name, age, department));

            } else {
                System.out.println("employee records are empty!");
            }
        }
        catch (SQLException e){
            System.out.println("Retrieving employee is unsuccessful! Reason: "+ e.getSQLState());
        }


    }
}

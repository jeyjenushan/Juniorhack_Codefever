package com.crudoperation.Students;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateStudent implements StudentOperation{
    Scanner scanner=new Scanner(System.in);
    @Override
    public void operation(Connection conn) {
        System.out.println("Update student...\n\n");
        System.out.println("Student Id(eg:abc001) : \n");
        String id=scanner.nextLine();

        System.out.println("Enter the attribute to update[1-name,2-age,3-department] : ");
        int attributeOpinion=scanner.nextInt();
        String value = null;
        String  attribute = null;
        System.out.println("New value : ");
        switch (attributeOpinion){
            case 1:
                  attribute="name";
                 value=scanner.nextLine();
                break;
            case 2:
                attribute="age";
                value=scanner.nextLine();
                break;
            case 3:
                attribute="department";
                value=scanner.nextLine();
                break;

        }
        String sql = "UPDATE employees SET " + attribute + " = ? WHERE employee_id = ?";
        try(PreparedStatement preparedStatement = conn.prepareStatement(sql);) {

            if(!attribute.equals("age")) {
                preparedStatement.setString(1,value .toString());
            }else{
                preparedStatement.setInt(1,Integer.parseInt(value.toString()));
            }
            preparedStatement.setString(2,id);

            int res = preparedStatement.executeUpdate(); // can use  preparedStatement.executeUpdate();
            if (res>0) {
                System.out.println("Successfully updated the record of the employee Id: " + id);
            } else {
                System.out.println("Updating employee is unsuccessful!");
            }
        }
        catch ( SQLException e){
            System.out.println( "Updating employee is unsuccessful! Reason: "+ e.getMessage());
        }
    }




}


package com.smarteinc.employeemanagement.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Department {
    public void createDepartment() {

        String url = "jdbc:mysql://localhost:3306/empdb?useSSL=false";
        String user = "root";
        String password = "root";
        Scanner sc = new Scanner(System.in);


        System.out.println("enter department name");
        String name = sc.next();
        System.out.println("enter region");
        String region = sc.next();
        String sql = "INSERT INTO Department(Name,region) VALUES(?,?)";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, name);
            pst.setString(2, region);
            pst.executeUpdate();

            System.out.println("A new department has been inserted");

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(EntryClass.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        }
    }
}

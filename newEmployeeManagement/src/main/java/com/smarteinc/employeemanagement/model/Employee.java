package com.smarteinc.employeemanagement.model;

import java.io.Serializable;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class Employee {
    public void createEmployee() {

        String url = "jdbc:mysql://localhost:3306/empdb?useSSL=false";
        String user = "root";
        String password = "root";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter employee details");
        System.out.println("enter dept ID");
        int deptId = sc.nextInt();
        System.out.println("enter employee name");
        String ename = sc.next();
        System.out.println("enter employee CTC");
        int ctc = sc.nextInt();
        System.out.println("enter employee joining date in YYYY/MM/DD format");
        String date = sc.next();
        System.out.println("enter employee age");
        int age = sc.nextInt();
        System.out.println("enter employee password");
        String pwd = sc.next();
        String sql = "INSERT INTO employee(deptId,Name,ctc,joidate,age,password) VALUES(?,?,?,?,?,?)";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, String.valueOf(deptId));
            pst.setString(2, ename);
            pst.setString(3, String.valueOf(ctc));
            pst.setString(4, date);
            pst.setString(5, String.valueOf(age));
            pst.setString(6, pwd);
            pst.executeUpdate();

            System.out.println("A new employee has been inserted");

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(EntryClass.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        }
    }
}

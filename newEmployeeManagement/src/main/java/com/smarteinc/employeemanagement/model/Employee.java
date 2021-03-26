package com.smarteinc.employeemanagement.model;

import java.io.Serializable;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class Employee {
    int deptId;
    String ename;
    int ctc;
    String date;
    int age;
    String pwd;

    public void createEmployee() {

        String url = "jdbc:mysql://localhost:3306/empdb?useSSL=false";
        String user = "root";
        String password = "root";
        Scanner sc = new Scanner(System.in);
        String id = "SELECT Id From Department ";

        System.out.println("enter employee details");
        System.out.println("enter dept ID");
        if (sc.hasNextInt() && sc.equals(id)) {
            deptId = sc.nextInt();
        } else {
            System.out.println("enter valid Id");
        }

        System.out.println("enter employee name");
        if (sc.hasNext("[A-Za-z]*")) {
            ename = sc.next();
        } else {
            System.out.println("Please Enter a Valid Value");
        }

        System.out.println("enter employee CTC");
        if (sc.hasNextInt()) {
            ctc = sc.nextInt();
        } else {
            System.out.println("enter valid CTC");
        }
        System.out.println("enter employee joining date in YYYY/MM/DD format");
        if (sc.hasNext("[A-Za-z]*")) {
            date = sc.next();
        } else {
            System.out.println("Please Enter a Valid Value");
        }

        System.out.println("enter employee age");
        if (sc.hasNextInt()) {
            age = sc.nextInt();
        } else {
            System.out.println("enter valid age");
        }

        System.out.println("enter employee password");

        if (sc.hasNext("[A-Za-z]*")) {
            pwd = sc.next();
        } else {
            System.out.println("Please Enter a Valid Value");
        }


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


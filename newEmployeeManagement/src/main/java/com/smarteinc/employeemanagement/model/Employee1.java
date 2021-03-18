package com.smarteinc.employeemanagement.model;

import jdk.jfr.DataAmount;


public
class Employee1 {
    int id;

    String name;

    int age;

    boolean Status;

    String department;

    int yearOfJoining;

    double CTC;

    String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getCTC() {
        return CTC;
    }

    public void setCTC(double CTC) {
        this.CTC = CTC;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public Employee1(int id, String name, int age, boolean status, String department, int yearOfJoining, double CTC, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.Status = status;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.CTC = CTC;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", Status=" + Status +
                ", department='" + department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", CTC=" + CTC +
                ", city='" + city + '\'' +
                '}';
    }
}
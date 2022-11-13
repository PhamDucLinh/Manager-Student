package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private int Id;
    private String Fullname;
    private String Address;
    private String PhoneNumber;


    public Student(){

    }

    public Student(int id, String fullname, String address, String phoneNumber) {
        Id = id;
        Fullname = fullname;
        Address = address;
        PhoneNumber = phoneNumber;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Fullname='" + Fullname + '\'' +
                ", Address='" + Address + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }
}

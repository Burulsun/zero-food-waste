package com.example.newfyp.Common.LoginPage;

public class UserHelperClass {
    public UserHelperClass(String name, String username, String email, int phoneNo, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.phoneNo = phoneNo;
        this.password = password;
    }

    public UserHelperClass(String name, String username, String phoneNo, String password) {


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    String name;
    String username;
    String email;
    int phoneNo;
    String password;

}






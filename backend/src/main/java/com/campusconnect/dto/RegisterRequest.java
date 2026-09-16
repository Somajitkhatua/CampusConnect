package com.campusconnect.dto;

import com.campusconnect.entity.User;

public class RegisterRequest {
    private String name;
    private String email;
    private String password;
    private User.Role role;
    private String college;
    private String companyName;

    public RegisterRequest() {}

    public RegisterRequest(String name, String email, String password, User.Role role, String college, String companyName) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.college = college;
        this.companyName = companyName;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public User.Role getRole() { return role; }
    public void setRole(User.Role role) { this.role = role; }

    public String getCollege() { return college; }
    public void setCollege(String college) { this.college = college; }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
}

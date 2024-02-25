package com.example.demo;

public class UserDTO {

    private String name;
    private String gender;
    private String email;
    public UserDTO(String name, String gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
    
    
}

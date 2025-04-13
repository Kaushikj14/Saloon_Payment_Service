package com.example.Payment.service.payload.dto;

public class UserDTO {

    private Long id;
    private String fullName;
    private String email;

    public UserDTO() {
    }

    public UserDTO(Long id, String fullName,String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

}

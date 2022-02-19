package com.umb.movilguia1.model.entity;

public class User {
    private Integer idUser;
    private String fullName;
    private String email;
    private String password;

    public User(Integer idUser, String fullName, String email, String password) {
        this.idUser = idUser;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

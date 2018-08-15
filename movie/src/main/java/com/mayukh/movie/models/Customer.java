package com.mayukh.movie.models;

public class Customer {

    private long id;
    private String email;
    private String phone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhone() {return phone; }
    public void setPhone(String phone) { this.phone = phone; }

}

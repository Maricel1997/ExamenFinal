package com.maricel.finalmaricel;

public class Club {
    private Integer id;
    private String name;
    private String phone;
    private String document;

    public Club() {
    }

    public Club(Integer id, String name, String telefono, String ci) {
        this.id = id;
        this.name = name;
        this.phone = telefono;
        this.document = ci;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCi() {
        return document;
    }

    public void setCi(String ci) {
        this.document = document;
    }
}




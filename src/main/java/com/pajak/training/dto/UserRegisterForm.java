package com.pajak.training.dto;

import javax.persistence.Column;

public class UserRegisterForm {

    private String name;
    private Integer age;
    private String email;

    private Long id;
    private String streetName;
    private Integer postCode;
    private Integer rt;
    private Integer rw;


    public UserRegisterForm(String name,
                            Integer age,
                            String email,
                            Long id,
                            String streetName,
                            Integer postCode,
                            Integer rt,
                            Integer rw) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.id = id;
        this.streetName = streetName;
        this.postCode = postCode;
        this.rt = rt;
        this.rw = rw;
    }

    public UserRegisterForm() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }

    public Integer getRt() {
        return rt;
    }

    public void setRt(Integer rt) {
        this.rt = rt;
    }

    public Integer getRw() {
        return rw;
    }

    public void setRw(Integer rw) {
        this.rw = rw;
    }
}

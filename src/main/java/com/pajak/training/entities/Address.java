package com.pajak.training.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "training_adress")
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String streetName;

    @Column
    private Integer postCode;

    @Column
    private Integer rt;

    @Column
    private Integer rw;

//    @ManyToMany
//    @JsonIgnoreProperties(value = "{adressList}")
//    private User user;


    public Address() {
    }

    public Address(String streetName, Integer postCode, Integer rt, Integer rw) {
        this.streetName = streetName;
        this.postCode = postCode;
        this.rt = rt;
        this.rw = rw;
    }

    public Address(Long id, String streetName, Integer postCode, Integer rt, Integer rw) {
        this.id = id;
        this.streetName = streetName;
        this.postCode = postCode;
        this.rt = rt;
        this.rw = rw;
    }

    public Address(Long id) {
        this.id = id;
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

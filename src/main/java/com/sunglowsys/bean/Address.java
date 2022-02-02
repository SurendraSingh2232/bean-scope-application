package com.sunglowsys.bean;


import org.springframework.beans.factory.annotation.Value;

public class Address {

    private String id;
    private String houseNo;
    private String street;
    private String city;
    private String zipcode;

    public Address(){
        System.out.println("Address object created");
    }

    public String getId() {
        return id;
    }

    @Value("SGS122")
    public void setId(String id) {
        this.id = id;
    }

    public String getHouseNo() {
        return houseNo;
    }
    @Value("553H")
    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }
    @Value("Mohanpura road")
    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }
    @Value("kasganj")
    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }
    @Value("207123")
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }


}

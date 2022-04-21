package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Orders {
    @JsonProperty("id")
    private String id;

    @JsonProperty("flavour")
    private String flavour;

    @JsonProperty("crust")
    private String crust;

    @JsonProperty("name")
    private String name;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("address")
    private String address;

    @JsonProperty("createdAt")
    private Date createdAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id='" + id + '\'' +
                ", Flavor=" + flavour +
                '}';
    }
}

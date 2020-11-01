package com.yalco.flyaway.model.binding;

import com.yalco.flyaway.entity.Address;

public class AirportBindingModel {

    private AddressBidingModel address;
    private String name;
    private String pictureUrl;
    private String description;

    public AddressBidingModel getAddress() {
        return address;
    }

    public void setAddress(AddressBidingModel address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package main.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AddressModel {
    @Column(name = "City")
    private String city;

    @Column(name = "Street")
    private String street;

    @Column(name = "House")
    private Integer house;

    public AddressModel(String street, String city, Integer house) {
        this.street = street;
        this.city = city;
        this.house = house;
    }

    public AddressModel() {}

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getHouse() {
        return house;
    }

    public void setHouse(Integer house) {
        this.house = house;
    }
}

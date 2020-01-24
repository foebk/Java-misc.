package main.entities;

import main.models.AddressModel;

import javax.persistence.*;

@Entity
@Table(name = "Addresses")
public class Address {
    private Integer id;

    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(column = @Column(name = "City"), name = "city"),
            @AttributeOverride(column = @Column(name = "Address"), name = "street"),
            @AttributeOverride(column = @Column(name = "House"), name = "house")
    })
    private AddressModel addressModel;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AddressModel getAddressModel() {
        return addressModel;
    }

    public void setAddressModel(AddressModel addressModel) {
        this.addressModel = addressModel;
    }
}

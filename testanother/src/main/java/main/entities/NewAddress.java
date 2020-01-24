package main.entities;

import main.models.AddressModel;

import javax.persistence.*;

@Entity
@Table(name = "new_address")
public class NewAddress {
    private AddressModel addressModel;
    private Integer id;

    public NewAddress() {}

    public NewAddress(AddressModel addressModel) {
        this.addressModel = addressModel;
    }

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

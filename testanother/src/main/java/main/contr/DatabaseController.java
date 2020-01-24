package main.contr;

import main.entities.Address;
import main.entities.Human;
import main.entities.NewAddress;
import main.models.AddressModel;
import main.repo.AddressesRepository;
import main.repo.NewAddressesRepository;
import main.repo.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DatabaseController {
    private TestRepository testRepository;
    private AddressesRepository addressesRepository;
    private NewAddressesRepository newAddressesRepository;

    @Autowired
    public DatabaseController(TestRepository testRepository, AddressesRepository addressesRepository, NewAddressesRepository newAddressesRepository) {
        this.testRepository = testRepository;
        this.addressesRepository = addressesRepository;
        this.newAddressesRepository = newAddressesRepository;
    }

    @GetMapping("/test")
    public List<Human> getRecords(@RequestParam(name = "name") String name,
                                 @RequestParam(name = "surname") String surname,
                                 @RequestParam(name = "phone") Integer phone) {
        Human human = new Human();

        human.setName(name);
        human.setSurname(surname);
        human.setNumber(phone);

        testRepository.save(human);

        return testRepository.findAll();
    }

    @GetMapping("test1")
    public String createAddressRecord() {
        Address address = new Address();

        address.setAddressModel(new AddressModel("Lenina", "Moscow", 32));

        addressesRepository.save(address);

        return "ok";
    }

    @GetMapping("test2")
    public String createNewAddresRecord() {
        NewAddress newAddress = new NewAddress(new AddressModel("Lenina", "Moscow", 32));

        newAddressesRepository.save(newAddress);

        return "Ok";
    }
}

package main.repo;

import main.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressesRepository extends CrudRepository<Address, Integer> {
}

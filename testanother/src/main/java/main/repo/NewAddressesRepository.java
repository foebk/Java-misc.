package main.repo;

import main.entities.NewAddress;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Table;

@Table(name="new_address")
public interface NewAddressesRepository extends CrudRepository<NewAddress, Integer> {
}

package main.repo;

import main.entities.Human;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TestRepository extends CrudRepository<Human, Integer> {
    List<Human> findAll();
}

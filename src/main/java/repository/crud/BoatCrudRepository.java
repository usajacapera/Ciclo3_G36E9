package repository.crud;

import model.Boat;
import org.springframework.data.repository.CrudRepository;

public interface BoatCrudRepository extends CrudRepository<Boat, Integer>{
    
}

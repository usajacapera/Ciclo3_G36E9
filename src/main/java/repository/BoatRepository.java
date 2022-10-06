package repository;

import repository.crud.BoatCrudRepository;
import java.util.List;
import java.util.Optional;
import model.Boat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoatRepository {
    
    @Autowired
    private BoatCrudRepository crudRepository;
    
    public List<Boat> getAll() {
        return (List<Boat>)crudRepository.findAll();
    }
    
    public Optional<Boat> getBoat(int id) {
        return crudRepository.findById(id);
    }
    
    public Boat save(Boat b) {
        return crudRepository.save(b);
    }
}
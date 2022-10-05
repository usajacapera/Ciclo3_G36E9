package web;

import java.util.List;
import java.util.Optional;
import model.Boat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import service.BoatService;

@RestController                // url base es la ip de la máquina mas dos puntos y el puerto
@RequestMapping(":/api/Boat") //colocar la direccion del api
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class BoatController {
    
    @Autowired
    private BoatService boatService;
    
    @GetMapping("/all")
     public List<Boat> getBoats() {
        return boatService.getAll();
    }
     
     @GetMapping("/{id}")
     public Optional<Boat> getBoat(@PathVariable ("id") int id) {
         return boatService.getBoat(id);
     }         
     
     @PostMapping("/save")
     @ResponseStatus(HttpStatus.CREATED)
     public Boat save(@RequestBody Boat b) {
         return boatService.save(b);
     }
}

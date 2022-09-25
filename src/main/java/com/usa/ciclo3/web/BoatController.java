package com.usa.ciclo3.web;

import com.usa.ciclo3.model.Boat;
import com.usa.ciclo3.service.BoatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Boat")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,
        RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class BoatController {

    @Autowired
    private BoatService boatService;

    @GetMapping("/all")
    public List<Boat> getBoats(){
        return boatService.getAll();
    }

    @GetMapping("/{idBoat}")
    public Optional<Boat> getBoat(@PathVariable("idBoat") int idBoat){
        return boatService.getBoat(idBoat);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Boat save(@RequestBody Boat b){
        return boatService.save(b);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Boat update(@RequestBody Boat b){
        return boatService.update(b);
    }
}

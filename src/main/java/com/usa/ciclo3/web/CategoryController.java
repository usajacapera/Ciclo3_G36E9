package com.usa.ciclo3.web;

import com.usa.ciclo3.model.Category;
import com.usa.ciclo3.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Category")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,
        RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> getCategories(){
        return categoryService.getAll();
    }

    @GetMapping("/{idCategory}")
    public Optional<Category> getCategory(@PathVariable("idCategory") int idCategory){
        return categoryService.getCategory(idCategory);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@RequestBody Category ct){
        return categoryService.save(ct);
    }
}

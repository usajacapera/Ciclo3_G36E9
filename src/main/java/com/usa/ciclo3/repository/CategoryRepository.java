package com.usa.ciclo3.repository;


import com.usa.ciclo3.model.Category;
import com.usa.ciclo3.repository.crud.CategoryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepository {

    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    public List<Category> getAll(){
        return (List<Category>)categoryCrudRepository.findAll();
    }

    public Optional<Category> getCategory(int idCategory){
        return categoryCrudRepository.findById(idCategory);
    }

    public Category save(Category ct){
        return categoryCrudRepository.save(ct);
    }

}
package com.usa.ciclo3.service;

import com.usa.ciclo3.model.Category;
import com.usa.ciclo3.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll(){
        return categoryRepository.getAll();
    }

    public Optional<Category> getCategory(int idCategory){
        return categoryRepository.getCategory(idCategory);
    }

    public Category save(Category ct){
        if(ct.getIdCategory() == null){
            return categoryRepository.save(ct);
        }else{
            Optional<Category> ctaux = categoryRepository.getCategory(ct.getIdCategory());
            if(ctaux.isPresent()){
                return categoryRepository.save(ct);
            }else{
                return ct;
            }
        }
    }
}

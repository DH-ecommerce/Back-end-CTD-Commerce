package com.example.checkpointintegrador.controller;

import com.example.checkpointintegrador.model.Category;
import com.example.checkpointintegrador.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryServiceImpl categoryService;

    @CrossOrigin(origins = "*")
    @PostMapping("/save")
    private ResponseEntity saveCategory(@RequestBody Category category) {
        return ResponseEntity.ok(categoryService.save(category));
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    private ResponseEntity searchById(@PathVariable Integer id) {
        return ResponseEntity.ok(categoryService.searchById(id));
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/all")
    private ResponseEntity getAll(){
        return ResponseEntity.ok(categoryService.searchAll());
    }
}

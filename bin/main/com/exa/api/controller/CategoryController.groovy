package com.exa.api.controller

import com.exa.api.entity.Category
import com.exa.api.service.CategoryService
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*
import java.util.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/categories")
class CategoryController{
   @Autowired
   private final CategoryService CategoryService

   @GetMapping("")
   List<Category> findAll(){
      CategoryService.findAll()
   }

   @GetMapping("/{id}")
   Category findById(@PathVariable('id') int id){
      CategoryService.findById(id)
   }
}
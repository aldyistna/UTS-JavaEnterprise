package com.exa.api.service

import com.exa.api.entity.Category

import java.util.List

@Service
interface CategoryService{

    List<Category> findAll()

    Category findById(int id)
}
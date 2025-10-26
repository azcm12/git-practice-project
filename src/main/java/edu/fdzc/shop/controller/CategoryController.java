package edu.fdzc.shop.controller;

import edu.fdzc.shop.dto.CategoryDto;
import org.springframework.web.bind.annotation.*;
import edu.fdzc.shop.service.CategoryService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Resource
    private CategoryService categoryService;

    @GetMapping("/detail/{cid}")
    public CategoryDto detail(@PathVariable("cid") String categoryId){
        return categoryService.getCategoryById(categoryId);
    }

    @DeleteMapping("/delete/{cid}")
    public boolean delete(@PathVariable("cid") String categoryId){
        return categoryService.deleteCategory(categoryId);
    }
    @PostMapping("/add")
    public boolean add(@RequestBody CategoryDto categoryDto){
        return categoryService.saveCategory(categoryDto);
    }
    @PutMapping("/update")
    public boolean update(@RequestBody CategoryDto categoryDto){
        return categoryService.updateCategory(categoryDto);
    }


}

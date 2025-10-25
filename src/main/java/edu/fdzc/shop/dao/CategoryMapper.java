package edu.fdzc.shop.dao;

import edu.fdzc.shop.entity.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {
    int insert(Category category);

    int update(Category category);

    Category findById(String categoryId);

    int deleteById(String categoryId);

}

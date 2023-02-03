package com.ati.gulimall.gulimallproduct.dao;

import com.ati.gulimall.gulimallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author brady
 * @email brady6175@outlook.com
 * @date 2023-02-02 15:12:54
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

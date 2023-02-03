package com.ati.gulimall.gulimallproduct.service;

import com.ati.gulimall.gulimallcommon.fastutils.PageUtils;
import com.ati.gulimall.gulimallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author brady
 * @email brady6175@outlook.com
 * @date 2023-02-02 15:12:54
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


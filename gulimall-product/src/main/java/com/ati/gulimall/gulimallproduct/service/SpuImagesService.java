package com.ati.gulimall.gulimallproduct.service;

import com.ati.gulimall.gulimallcommon.fastutils.PageUtils;
import com.ati.gulimall.gulimallproduct.entity.SpuImagesEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * spu图片
 *
 * @author brady
 * @email brady6175@outlook.com
 * @date 2023-02-02 15:12:54
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


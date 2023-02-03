package com.ati.gulimall.gulimallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ati.gulimall.gulimallcommon.fastutils.PageUtils;
import com.ati.gulimall.gulimallcoupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author brady
 * @email brady6175@outlook.com
 * @date 2023-02-02 23:05:25
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.ati.gulimall.gulimallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ati.gulimall.gulimallcommon.fastutils.PageUtils;
import com.ati.gulimall.gulimallcoupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author brady
 * @email brady6175@outlook.com
 * @date 2023-02-02 23:05:25
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


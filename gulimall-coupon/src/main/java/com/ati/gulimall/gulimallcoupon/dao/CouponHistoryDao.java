package com.ati.gulimall.gulimallcoupon.dao;

import com.ati.gulimall.gulimallcoupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author brady
 * @email brady6175@outlook.com
 * @date 2023-02-02 23:05:25
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}

package com.ati.gulimall.gulimallcoupon.dao;

import com.ati.gulimall.gulimallcoupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author brady
 * @email brady6175@outlook.com
 * @date 2023-02-02 23:05:25
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}

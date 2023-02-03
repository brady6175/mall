package com.ati.gulimall.gulimallorder.dao;

import com.ati.gulimall.gulimallorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author brady
 * @email brady6175@outlook.com
 * @date 2023-02-02 23:18:11
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

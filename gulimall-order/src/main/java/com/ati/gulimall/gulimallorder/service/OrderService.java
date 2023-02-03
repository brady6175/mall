package com.ati.gulimall.gulimallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ati.gulimall.gulimallcommon.fastutils.PageUtils;
import com.ati.gulimall.gulimallorder.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author brady
 * @email brady6175@outlook.com
 * @date 2023-02-02 23:18:11
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.ati.gulimall.gulimallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ati.gulimall.gulimallcommon.fastutils.PageUtils;
import com.ati.gulimall.gulimallware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author brady
 * @email brady6175@outlook.com
 * @date 2023-02-02 23:20:37
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


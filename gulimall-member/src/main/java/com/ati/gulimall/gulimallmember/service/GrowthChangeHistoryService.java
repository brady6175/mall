package com.ati.gulimall.gulimallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ati.gulimall.gulimallcommon.fastutils.PageUtils;
import com.ati.gulimall.gulimallmember.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author brady
 * @email brady6175@outlook.com
 * @date 2023-02-02 23:15:37
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


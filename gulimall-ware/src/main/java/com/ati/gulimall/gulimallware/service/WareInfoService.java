package com.ati.gulimall.gulimallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ati.gulimall.gulimallcommon.fastutils.PageUtils;
import com.ati.gulimall.gulimallware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author brady
 * @email brady6175@outlook.com
 * @date 2023-02-02 23:20:37
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


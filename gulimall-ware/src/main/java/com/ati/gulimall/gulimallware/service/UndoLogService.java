package com.ati.gulimall.gulimallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ati.gulimall.gulimallcommon.fastutils.PageUtils;
import com.ati.gulimall.gulimallware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author brady
 * @email brady6175@outlook.com
 * @date 2023-02-02 23:20:37
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


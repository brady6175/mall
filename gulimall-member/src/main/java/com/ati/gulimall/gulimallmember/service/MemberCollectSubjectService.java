package com.ati.gulimall.gulimallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ati.gulimall.gulimallcommon.fastutils.PageUtils;
import com.ati.gulimall.gulimallmember.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author brady
 * @email brady6175@outlook.com
 * @date 2023-02-02 23:15:37
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


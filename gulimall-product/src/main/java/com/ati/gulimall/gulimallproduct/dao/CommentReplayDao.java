package com.ati.gulimall.gulimallproduct.dao;

import com.ati.gulimall.gulimallproduct.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author brady
 * @email brady6175@outlook.com
 * @date 2023-02-02 15:12:54
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}

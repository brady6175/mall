package com.ati.gulimall.gulimallmember.dao;

import com.ati.gulimall.gulimallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author brady
 * @email brady6175@outlook.com
 * @date 2023-02-02 23:15:37
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

package com.ljnan.zbxt.mapper;

import com.ljnan.zbxt.model.Ta;

public interface TaMapper {
    int deleteByPrimaryKey(String bh);

    int insert(Ta record);

    int insertSelective(Ta record);

    Ta selectByPrimaryKey(String bh);

    int updateByPrimaryKeySelective(Ta record);

    int updateByPrimaryKey(Ta record);
}
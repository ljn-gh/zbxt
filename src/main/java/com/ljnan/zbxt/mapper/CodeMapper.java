package com.ljnan.zbxt.mapper;

import com.ljnan.zbxt.model.Code;

public interface CodeMapper {
    int insert(Code record);

    int insertSelective(Code record);
}
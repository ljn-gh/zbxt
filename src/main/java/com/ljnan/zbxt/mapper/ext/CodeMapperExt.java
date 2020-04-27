package com.ljnan.zbxt.mapper.ext;


import com.ljnan.zbxt.model.Code;

import java.util.List;

/**
 * @author lijianan
 * @date 2020-04-21 17:19
 * @description
 */
public interface CodeMapperExt {
    /**
     * 获取单值代码集合
     *
     * @return
     */
    List<Code> getCodeList();
}

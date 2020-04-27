package com.ljnan.zbxt.service;


import com.ljnan.zbxt.model.Code;

import java.util.List;

/**
 * @author lijianan
 * @date 2020-04-21 17:04
 * @description
 */
public interface TestService {
    /**
     * 获取单值代码表
     *
     * @return
     */
    List<Code> getCodeList();
}

package com.ljnan.zbxt.service.impl;

import com.ljnan.zbxt.mapper.ext.CodeMapperExt;
import com.ljnan.zbxt.model.Code;
import com.ljnan.zbxt.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lijianan
 * @date 2020-04-21 17:04
 * @description
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private CodeMapperExt codeMapperExt;

    @Override
    public List<Code> getCodeList() {
        System.out.println("缓存");
        return codeMapperExt.getCodeList();
    }
}

package com.yan.feign.impl;

import com.yan.entity.Student;
import com.yan.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    /**
     * 访问index方法如果出错进入FeignError
     */
    @Override
    public String index() {
        return "服务器维护中......";
    }


}

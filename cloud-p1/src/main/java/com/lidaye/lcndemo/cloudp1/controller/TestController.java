package com.lidaye.lcndemo.cloudp1.controller;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tracing.TracingContext;
import com.lidaye.lcndemo.cloudp1.mapper.Test2Mapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private Test2Mapper test2Mapper;

    @LcnTransaction
    @GetMapping("/run/{name}")
    public Object run(@PathVariable String name) {
        System.out.println(TracingContext.tracing().groupId());
        if("lidaye".equals(name)) {
            throw new RuntimeException("lidaye is illicit");
        }
        return test2Mapper.updateOne(name);
    }
}

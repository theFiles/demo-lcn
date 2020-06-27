package com.lidaye.lcndemo.cloudp2.controller;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tracing.TracingContext;
import com.lidaye.lcndemo.cloudp2.mapper.Test1Mapper;
import com.lidaye.lcndemo.cloudp2.service.P1PortService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private Test1Mapper test1Mapper;

    @Resource
    private P1PortService p1PortService;

    @LcnTransaction
    @GetMapping("/run/{name}")
    public Object run(@PathVariable String name) {
        test1Mapper.updateOne(name);
        System.out.println(TracingContext.tracing().groupId());
        return p1PortService.run(name);
    }
}

package com.lidaye.lcndemo.cloudp2.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("p1")
public interface P1PortService {
    @GetMapping("/run/{name}")
    Object run(@PathVariable String name);
}

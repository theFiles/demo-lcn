package com.lidaye.lcndemo.cloudp2.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface Test1Mapper {
    int updateOne(@Param("name") String name);

    Map<String,Object> getOne();
}

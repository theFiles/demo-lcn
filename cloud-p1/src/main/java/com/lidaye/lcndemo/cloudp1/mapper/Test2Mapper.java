package com.lidaye.lcndemo.cloudp1.mapper;

import org.apache.ibatis.annotations.Param;

public interface Test2Mapper {
    int updateOne(@Param("name") String name);
}

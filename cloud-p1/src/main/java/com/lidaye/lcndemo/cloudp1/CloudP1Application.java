package com.lidaye.lcndemo.cloudp1;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableDistributedTransaction
@SpringBootApplication
@MapperScan("com.lidaye.lcndemo.cloudp1.mapper")
public class CloudP1Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudP1Application.class, args);
    }

}

package com.lidaye.lcndemo.cloudp2;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;



@EnableDistributedTransaction
@EnableFeignClients
@SpringBootApplication
@MapperScan("com.lidaye.lcndemo.cloudp2.mapper")
public class CloudP2Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudP2Application.class, args);
    }

}

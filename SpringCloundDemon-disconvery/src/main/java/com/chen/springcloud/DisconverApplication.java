package com.chen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @decription
 * @atuhor:陈红卫
 * @create : 2017-06-12-21:35
 */

@SpringBootApplication
@EnableEurekaServer
public class DisconverApplication {

    /*
    * 通过EableeureKaServer来开启
    * */

    public static void main(String[] args) {
        SpringApplication.run(DisconverApplication.class);
    }
}

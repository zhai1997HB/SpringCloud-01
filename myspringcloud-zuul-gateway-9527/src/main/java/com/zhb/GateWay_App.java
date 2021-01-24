package com.zhb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author zhb
 */
@EnableZuulProxy
@SpringBootApplication
public class GateWay_App {
    public static void main(String[] args) {
        SpringApplication.run(GateWay_App.class,args);
    }
}

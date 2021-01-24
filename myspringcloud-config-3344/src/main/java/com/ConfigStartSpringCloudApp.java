package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


/**
 * @author zhb
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigStartSpringCloudApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigStartSpringCloudApp.class,args);
    }
}

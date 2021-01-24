package com.zhb.springboot.cfbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhb
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced
    public RestTemplate template(){
        return  new RestTemplate();
    }

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}

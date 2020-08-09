package com.luban.power;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author <a href="mailto:jiangyue@dtstack.com">江月 At 袋鼠云</a>.
 * @description
 * @date 2020/8/7 10:33 上午
 */
@SpringBootApplication
@EnableEurekaClient
public class PowerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PowerApplication.class);
    }

}

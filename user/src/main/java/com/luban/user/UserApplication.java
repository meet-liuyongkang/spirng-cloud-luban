package com.luban.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author <a href="mailto:jiangyue@dtstack.com">江月 At 袋鼠云</a>.
 * @description
 * @date 2020/8/7 9:43 上午
 */
@SpringBootApplication
@EnableEurekaClient
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class);
    }

}

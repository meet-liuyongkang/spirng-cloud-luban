package com.luban.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href="mailto:jiangyue@dtstack.com">江月 At 袋鼠云</a>.
 * @description
 * @date 2020/8/11 8:12 下午
 */
@Configuration
public class AppConfig {

    @Bean
    public MyIRule myIRule(){
        return new MyIRule();
    }

}

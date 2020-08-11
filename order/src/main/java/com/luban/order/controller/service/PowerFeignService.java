package com.luban.order.controller.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author <a href="mailto:jiangyue@dtstack.com">江月 At 袋鼠云</a>.
 * @description
 * @date 2020/8/11 5:34 下午
 */
@FeignClient(value = "SERVER-POWER")
public interface PowerFeignService {

    @RequestMapping("/powerIndex")
    Object getPower();

}

package com.luban.user.service;

import com.luban.user.service.impl.PowerFeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author <a href="mailto:jiangyue@dtstack.com">江月 At 袋鼠云</a>.
 * @description
 * @date 2020/8/11 5:34 下午
 */
@FeignClient(value = "SERVER-POWER", fallback = PowerFeignServiceImpl.class)
public interface PowerFeignService {

    @RequestMapping("/powerIndex")
    Object getPower();

    @RequestMapping("/powerError")
    Object powerError();

    @RequestMapping("/powerTimeOut")
    Object powerTimeOut();

    @RequestMapping("/powerBatchFallback")
    Object powerBatchFallback();

}

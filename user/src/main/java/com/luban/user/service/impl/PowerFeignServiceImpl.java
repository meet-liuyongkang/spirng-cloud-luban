package com.luban.user.service.impl;

import com.luban.user.service.PowerFeignService;

/**
 * @author <a href="mailto:jiangyue@dtstack.com">江月 At 袋鼠云</a>.
 * @description
 * @date 2020/8/12 10:45 上午
 */
//@Component
public class PowerFeignServiceImpl implements PowerFeignService {

    @Override
    public Object getPower() {
        return "BatchFallback：getPower（）系统网络异常，请稍后再试";
    }

    @Override
    public Object powerError() {
        return "BatchFallback：powerError（）系统网络异常，请稍后再试";
    }

    @Override
    public Object powerTimeOut() {
        return "BatchFallback：powerTimeOut（）系统网络异常，请稍后再试";
    }

    @Override
    public Object powerBatchFallback() {
        return "BatchFallback：powerBatchFallback（）系统网络异常，请稍后再试";
    }

}

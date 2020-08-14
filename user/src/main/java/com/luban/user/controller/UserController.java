package com.luban.user.controller;

import com.luban.user.service.PowerFeignService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:jiangyue@dtstack.com">江月 At 袋鼠云</a>.
 * @description
 * @date 2020/8/7 9:45 上午
 */
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private PowerFeignService powerFeignService;

    @RequestMapping("userIndex")
    public String userIndex(){
        return "user";
    }


    @RequestMapping("getPower")
    public Map<String,Object> powerIndex(){
        Map map = new HashMap<String,String>();
        Object object = restTemplate.getForObject("http://SERVER-POWER/powerIndex", Object.class);
        map.put("success",object);
        return map;
    }

    @RequestMapping("getPowerFeign")
    public Map<String,Object> getPowerFeign(){
        Map map = new HashMap<String,String>();
        Object object = powerFeignService.getPower();
        map.put("success",object);
        return map;
    }

    @RequestMapping("getPowerError")
    @HystrixCommand(fallbackMethod = "getPowerErrorFallback")
    public Map<String,Object> getPowerError(){
        Map map = new HashMap<String,String>();
        Object object = powerFeignService.powerError();
        map.put("success",object);
        return map;
    }

    @RequestMapping("getPowerTimeOut")
    @HystrixCommand(fallbackMethod = "getPowerTimeOutFallback")
    public Map<String,Object> getPowerTimeOut(){
        Map map = new HashMap<String,String>();
        Object object = powerFeignService.powerTimeOut();
        map.put("success",object);
        return map;
    }

    @RequestMapping("getPowerBatchFallback")
    @HystrixCommand
    public Map<String,Object> getPowerBatchFallback(){
        Map map = new HashMap<String,String>();
        Object object = powerFeignService.powerBatchFallback();
        map.put("success",object);
        return map;
    }


    public Map<String,Object> getPowerErrorFallback(){
        Map map = new HashMap<String,String>();
        map.put("success","power服务请求出错了，请稍后再试！");
        return map;
    }


    public Map<String,Object> getPowerTimeOutFallback(){
        Map map = new HashMap<String,String>();
        map.put("success","power服务请求超时了，请稍后再试！");
        return map;
    }

}

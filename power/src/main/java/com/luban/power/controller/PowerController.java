package com.luban.power.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:jiangyue@dtstack.com">江月 At 袋鼠云</a>.
 * @description
 * @date 2020/8/7 10:34 上午
 */
@RestController
public class PowerController {

    @RequestMapping("powerIndex")
    public Map<String,String> powerIndex(){
        Map map = new HashMap<String,String>();
        map.put("success","power");
        return map;
    }

    @RequestMapping("powerError")
    public Map<String,String> powerError(){
        Map map = new HashMap<String,String>();
        map.put("success","powerError");
        return map;
    }

    @RequestMapping("powerTimeOut")
    public Map<String,String> powerTimeOut(){
        System.out.println("powerTimeOut   00000000000000");
        Map map = new HashMap<String,String>();
        map.put("success","powerTimeOut");
        return map;
    }

    @RequestMapping("powerBatchFallback")
    public Map<String,String> powerBatchFallback(){
        Map map = new HashMap<String,String>();
        map.put("success","powerBatchFallback");
        return map;
    }

}

package com.luban.order.controller;

import com.luban.order.controller.service.PowerFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:jiangyue@dtstack.com">江月 At 袋鼠云</a>.
 * @description
 * @date 2020/8/9 11:41 上午
 */
@RestController
public class OrderController {

    @Autowired
    private PowerFeignService powerFeignService;

    @RequestMapping("/orderIndex")
    public String orderIndex(){
        return "order";
    }

    @RequestMapping("getPowerFeign")
    public Map<String,Object> getPowerFeign(){
        Map map = new HashMap<String,String>();
        Object object = powerFeignService.getPower();
        map.put("success",object);
        return map;
    }

}

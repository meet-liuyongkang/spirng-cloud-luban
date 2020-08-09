package com.luban.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:jiangyue@dtstack.com">江月 At 袋鼠云</a>.
 * @description
 * @date 2020/8/9 11:41 上午
 */
@RestController
public class OrderController {

    @RequestMapping("/orderIndex")
    public String orderIndex(){
        return "order";
    }

}

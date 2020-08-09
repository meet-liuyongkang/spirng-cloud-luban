package com.luban.power.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:jiangyue@dtstack.com">江月 At 袋鼠云</a>.
 * @description
 * @date 2020/8/7 10:34 上午
 */
@RestController
public class PowerController {

    @RequestMapping("powerIndex")
    public String powerIndex(){
        return "power1";
    }

}

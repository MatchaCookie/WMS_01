package com.letmeng.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sys")
public class SystemController {

    @RequestMapping("toLogin")
    public String toLogin() {
        return "system/index/login";
    }

    @RequestMapping("index")
    public String index() {
        return "system/index/index";
    }

}

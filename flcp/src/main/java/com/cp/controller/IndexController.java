package com.cp.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class IndexController {
    @RequestMapping("index")
    public String index(){
        log.info("成功访问首页...");
        return "frontEndIndex.html";
    }
}

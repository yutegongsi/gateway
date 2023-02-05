package com.cace.gateway.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GateWayController {

    @RequestMapping("/*")
    public JSONObject index(){
        //默认拦截所有请求，但是要注意非法请求 网关需要有过滤垃圾请求的功能
        return null;
    }
}

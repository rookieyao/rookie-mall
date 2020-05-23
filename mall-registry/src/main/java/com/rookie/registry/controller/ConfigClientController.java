package com.rookie.registry.controller;

import org.springframework.beans.factory.annotation.Value;

/**
 * @Author rookie
 * @Date 2020/5/22 15:34
 * @Description
 **/
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo;

//    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}

package com.itheima.security.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Yan.Guan
 * @date: 2020/8/25 13:42
 * @description:
 */

@RestController
public class RedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @PostMapping("/save")
    private String saveValue() {
        stringRedisTemplate.opsForValue().set("designer_info","xefdvsgfsacsdgescasdasffrbddsasumghdv");
        return "SUCCESS";
    }

    @PostMapping("/getValue")
    private String getValue() {
        return stringRedisTemplate.opsForValue().get("designer_info");
    }
}

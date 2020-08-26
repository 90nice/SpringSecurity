package com.itheima.security.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author: Yan.Guan
 * @date: 2020/8/25 16:50
 * @description:
 */

@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 60)  //开启Session共享功能
public class SessionConfig {
}

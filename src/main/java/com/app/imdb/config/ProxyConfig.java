package com.app.imdb.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.app.imdb.feign")
public class ProxyConfig {
}

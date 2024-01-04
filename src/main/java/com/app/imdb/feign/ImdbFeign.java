package com.app.imdb.feign;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "https://imdb-api.com",path = "")
public interface ImdbFeign {
}

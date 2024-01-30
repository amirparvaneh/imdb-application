package com.app.imdb.feign;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "imdb",url = "https://imdb-api.com")
public interface ImdbFeign {
}

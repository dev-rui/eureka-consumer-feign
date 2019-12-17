package com.example.eurekaconsumerfeign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "eureka-client",fallback =UserFeignClientFallback.class )
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

}
@Component
 class UserFeignClientFallback implements DcClient {

    @Override
    public String consumer() {
        return "fallback";
    }
}
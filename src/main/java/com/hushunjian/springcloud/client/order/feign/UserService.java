package com.hushunjian.springcloud.client.order.feign;

import com.hushunjian.springcloud.client.order.response.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "client-user")
public interface UserService {

    @GetMapping(value = "/user/findById")
    UserResponse findById(@RequestParam("id") String id);
}

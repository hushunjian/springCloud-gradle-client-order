package com.hushunjian.springcloud.client.order.controller;

import com.hushunjian.springcloud.client.order.domain.Order;
import com.hushunjian.springcloud.client.order.feign.UserService;
import com.hushunjian.springcloud.client.order.response.OrderResponse;
import com.hushunjian.springcloud.client.order.response.UserResponse;
import com.hushunjian.springcloud.client.order.service.OrderService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.hushunjian.springcloud.client.order.copier.OrderCopier.ORDER_COPIER;

@RequestMapping("order")
@RestController(value = "order")
public class OrderController extends BaseController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @ApiOperation("查询订单信息")
    @GetMapping(value = "findById")
    @ApiImplicitParam(value = "订单主键ID", name = "id", paramType = "query")
    public Object findById(@RequestParam String id){
        Order order = orderService.findById(id);
        UserResponse user = userService.findById(order.getUserId());
        OrderResponse orderResponse = ORDER_COPIER.toOrderResponse(order, user);
        return success(orderResponse);
    }
}

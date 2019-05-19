package com.hushunjian.springcloud.client.order.service;

import com.hushunjian.springcloud.client.order.domain.Order;

public interface OrderService {
    /**
     * 根据ID获取订单信息
     *
     * @param id
     * @return
     */
    Order findById(String id);
}

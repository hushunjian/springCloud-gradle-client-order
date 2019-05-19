package com.hushunjian.springcloud.client.order.service.impl;

import com.hushunjian.springcloud.client.order.domain.Order;
import com.hushunjian.springcloud.client.order.mapper.OrderMapper;
import com.hushunjian.springcloud.client.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    /**
     * 根据ID获取订单信息
     *
     * @param id
     * @return
     */
    @Override
    public Order findById(String id) {
        return orderMapper.selectByPrimaryKey(id);
    }
}

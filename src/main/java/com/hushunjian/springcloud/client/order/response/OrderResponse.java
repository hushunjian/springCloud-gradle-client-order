package com.hushunjian.springcloud.client.order.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class OrderResponse {

    @ApiModelProperty(value = "订单主键ID")
    private String id;

    @ApiModelProperty(value = "订单名称")
    private String orderName;

    @ApiModelProperty(value = "订单备注")
    private String orderRemark;

    @ApiModelProperty(value = "收货地址")
    private String receiveAddress;

    @ApiModelProperty(value = "收货人信息")
    private UserResponse user;
}

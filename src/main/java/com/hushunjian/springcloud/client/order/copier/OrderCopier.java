package com.hushunjian.springcloud.client.order.copier;

import com.hushunjian.springcloud.client.order.domain.Order;
import com.hushunjian.springcloud.client.order.response.OrderResponse;
import com.hushunjian.springcloud.client.order.response.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderCopier {

    OrderCopier ORDER_COPIER = Mappers.getMapper(OrderCopier.class);

    @Mapping(source = "order.id", target = "id")
    OrderResponse toOrderResponse(Order order, UserResponse user);
}

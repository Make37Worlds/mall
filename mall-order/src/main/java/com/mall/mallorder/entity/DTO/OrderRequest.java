package com.mall.mallorder.entity.DTO;

import com.mall.mallorder.entity.Order;
import com.mall.mallorder.entity.OrderItem;

public class OrderRequest {
    private Long productId;
    private Integer quantity;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    public OrderItem toOrderItem() {
        OrderItem orderItem = new OrderItem();
        orderItem.setSkuId(productId);
        orderItem.setSkuQuantity(quantity);

        return orderItem;
    }

}


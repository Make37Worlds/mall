package com.mall.mallmember.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceClient {

    private final RestTemplate restTemplate;

    public OrderServiceClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String fetchOrderDetailsForMember(String memberId) {
        // Using the service name for DNS resolution within the Kubernetes cluster
        String orderServiceUrl = "http://mall-order-service:80/mallorderorder/" + memberId;
        return restTemplate.getForObject(orderServiceUrl, String.class);
    }
}

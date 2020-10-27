package com.binfen.controller;

import com.binfen.entity.Payment;
import com.binfen.entity.ResultEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: zhangBin 1394078687@qq.com
 * @description: TODO
 * @date: 2020/8/29 15:40
 */
@RestController
@Slf4j
public class OrderController {
//    public static final String PAYMENT_URL = "http://localhost:8001";
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public ResultEntity<Payment> create(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, ResultEntity.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public ResultEntity<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, ResultEntity.class);
    }
}

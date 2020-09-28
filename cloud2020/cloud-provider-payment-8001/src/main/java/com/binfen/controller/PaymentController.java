package com.binfen.controller;

import com.binfen.entity.Payment;
import com.binfen.entity.ResultEntity;
import com.binfen.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author: zhangBin 1394078687@qq.com
 * @description: TODO
 * @date: 2020/8/29 9:38
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public ResultEntity<Payment> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入结果：" + result);
        if (result > 0) {
            return new ResultEntity(200, "插入记录成功", result);
        } else {
            return new ResultEntity(500, "插入记录失败", result);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public ResultEntity<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果：" + payment);
        if (payment != null) {
            return new ResultEntity(200, "查询记录成功", payment);
        } else {
            return new ResultEntity(500, "查询记录失败", id);
        }
    }
}

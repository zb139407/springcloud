package com.binfen.service.impl;

import com.binfen.dao.PaymentDao;
import com.binfen.entity.Payment;
import com.binfen.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: zhangBin 1394078687@qq.com
 * @description: TODO
 * @date: 2020/8/29 9:36
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}

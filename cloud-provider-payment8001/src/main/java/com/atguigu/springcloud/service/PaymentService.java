package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

public interface PaymentService {

    /**
     * 创建一个 payment
     * @param payment
     * @return
     */
    CommonResult create(Payment payment);

    /**
     * 根据 id 查询 payment
     * @param id
     * @return
     */
    CommonResult getPaymentById(Long id);

}

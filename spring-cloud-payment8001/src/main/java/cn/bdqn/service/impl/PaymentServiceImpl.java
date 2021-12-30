package cn.bdqn.service.impl;

import cn.bdqn.entity.Payment;
import cn.bdqn.mapper.PaymentMapper;
import cn.bdqn.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @title:PaymentServiceImpl
 * @Author SwayJike
 * @Date:2021/12/28 20:50
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int save(Payment payment) {
        return paymentMapper.save(payment);
    }

    @Override
    public Payment getOne(Long id) {
        return paymentMapper.getOne(id);
    }
}

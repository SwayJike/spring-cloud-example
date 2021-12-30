package cn.bdqn.service;

import cn.bdqn.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @title:PaymentService
 * @Author SwayJike
 * @Date:2021/12/28 20:49
 * @Version 1.0
 */
public interface PaymentService {
    public int save(Payment payment);

    public Payment getOne(@Param("id") Long id);
}

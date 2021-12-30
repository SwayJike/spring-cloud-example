package cn.bdqn.mapper;

import cn.bdqn.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @title:PaymentMapper
 * @Author SwayJike
 * @Date:2021/12/28 20:19
 * @Version 1.0
 */
@Mapper
public interface PaymentMapper {

    public int save(Payment payment);

    public Payment getOne(@Param("id") Long id);
}

package cn.bdqn;

import cn.bdqn.service.PaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @title:Tester
 * @Author SwayJike
 * @Date:2021/12/28 20:52
 * @Version 1.0
 */
@SpringBootTest
public class Tester {

    @Autowired
    private PaymentService paymentService;

    @Test
    void loadContext(){
        System.out.println(paymentService.getOne(1L));
    }
}

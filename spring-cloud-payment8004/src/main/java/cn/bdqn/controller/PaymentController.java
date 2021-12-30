package cn.bdqn.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;

/**
 * @title:PaymentController
 * @Author SwayJike
 * @Date:2021/12/30 16:08
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/zk")
    public String paymentZk(){
        return "SpringCloud with Zookeeper:" + port + "\t" + UUID.randomUUID().toString();
    }
}

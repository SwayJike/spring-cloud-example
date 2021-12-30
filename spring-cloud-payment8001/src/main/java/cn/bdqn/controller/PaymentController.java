package cn.bdqn.controller;

import cn.bdqn.common.lang.CommonResult;
import cn.bdqn.entity.Payment;
import cn.bdqn.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title:PaymentController
 * @Author SwayJike
 * @Date:2021/12/28 20:54
 * @Version 1.0
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String port;

    @PostMapping("/save")
    public CommonResult savePayment(@RequestBody Payment payment){
        int flag = paymentService.save(payment);
        log.info("====插入結果===="+ flag);
        if (flag>0){
            return CommonResult.success(flag).setMessage(port);
        }else {
            return CommonResult.failure();
        }
    }

    @GetMapping("/getOne/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        Payment payment = paymentService.getOne(id);
        log.info("====查询成功===="+ payment);
        if (payment != null) {
            return CommonResult.success(payment).setMessage(port);
        }else {
            return CommonResult.failure();
        }
    }

    @GetMapping("/discovery")
    public CommonResult<DiscoveryClient> discovery(){

        List<String> services = discoveryClient.getServices();
        services.forEach(e -> log.info(e));

        String serviceId = "CLOUD-PAYMENT-SERVICE";
        List<ServiceInstance> instances = discoveryClient.getInstances(serviceId);

        instances.forEach(e -> {
            log.info(e.getServiceId() + "\t" +e.getHost() + "\t" +e.getPort()+ "\t" + e.getUri());
        });
        return CommonResult.success(discoveryClient);
    }
}

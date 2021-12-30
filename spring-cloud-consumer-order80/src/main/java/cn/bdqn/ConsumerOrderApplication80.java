package cn.bdqn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @title:ConsumerOrderApplication
 * @Author SwayJike
 * @Date:2021/12/28 21:49
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerOrderApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrderApplication80.class, args);
    }
}

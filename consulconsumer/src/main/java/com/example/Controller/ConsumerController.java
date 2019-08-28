package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 创建服务的消费者
 */
@RestController
public class ConsumerController {

    private static final String SERVICE_NAME = "spring-cloud-consul-producer";

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 获取所有服务 http://localhost:9002/services
     */
    @RequestMapping("/services")
    public Object services() {
        return discoveryClient.getInstances(SERVICE_NAME);
    }

    /**
     * 消费服务 http://localhost:9002/callSayHello?name=yy
     */
    @RequestMapping("/callSayHello")
    public String services(@RequestParam("name") String name) {
        ServiceInstance serviceInstance = (ServiceInstance) discoveryClient.getInstances(SERVICE_NAME);
        String callServiceResult = new RestTemplate().getForObject(serviceInstance.getUri().toString() + "/hello", String.class);
        System.out.println(callServiceResult);
        return callServiceResult;
    }
}

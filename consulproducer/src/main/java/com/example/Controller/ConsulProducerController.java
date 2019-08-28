package com.example.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 创建服务
 */
@RestController
public class ConsulProducerController {
    @Value("${server.port}")
    private Integer port;

    /**
     * 服务接口 http://localhost:9001/hello?name=xxx
     * @param name a name
     * @return String
     */
    @RequestMapping("/hello")
    public String sayHello(@RequestParam("name")String name) {
        return "hello ---> "+name+" port -->"+port;
    }
}

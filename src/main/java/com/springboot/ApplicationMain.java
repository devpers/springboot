package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ApplicationMain {

    /**
     * @SpringBootApplication
     *
     * 等价于
     *
     * @Controller
     * @EnableAutoConfiguration
     * @ComponentScan
     *
     * 需注意入口类位置，影响扫描范围
     * 放在根包或可以通过注解指定入口类位置或指定扫描包全路径
     *
     * 入口类可以扫描所有spring提供的注解
     *
     * 可以自定义注解，实现BeanPostProcessor接口
     *
     * 部署：
     * jar
     * war 需排除内置容器，并修改容器参数
     * linux 自动部署
     *
     * 默认配置文件application.yml、application.properties
     * 根目录（/config）或resource（/config）
     * 外部 java 命令
     * 
     */



    @RequestMapping("/")
    public String springboot(){
        return "spring boot";
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class, args);
    }

}

package com.xzw.api.marketing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAsync
public class SpringBootRun {

    private static Logger logger = LoggerFactory.getLogger(SpringBootRun.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootRun.class, args);
        logger.info("springboot启动成功了");
        System.out.println("启动成功了");
    }

    @RequestMapping("/system/checkServerHealth")
    public String checkServerHealth() {
        return "ok";
    }
}


package com.univ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author univ
 * @datetime 2018/12/3 6:49 PM
 * @description 启动入口类
 */

@SpringBootApplication(scanBasePackages = {"com.univ"})
public class ModuleSpringbootStarter {

    public static void main(String[] args) {
        // 启动spring boot应用程序
        SpringApplication.run(ModuleSpringbootStarter.class);
    }
}

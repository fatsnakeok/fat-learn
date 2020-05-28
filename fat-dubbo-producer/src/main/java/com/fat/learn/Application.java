package com.fat.learn;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@ImportResource(locations = {"classpath:dubbo-provider.xml"})
@NacosPropertySource(dataId = "base", autoRefreshed = true)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * 启动 string.
     *
     * @return the string
     */
    @GetMapping("/index")
    public String index() {
        return "fat dubbo生产者微服务启动完成！";
    }

}

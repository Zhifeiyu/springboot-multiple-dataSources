package com.zfylin;

import com.zfylin.config.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.net.UnknownHostException;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.zfylin")
@Import({DynamicDataSourceRegister.class})
@MapperScan("com.zfylin.mapper")
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
    }
}

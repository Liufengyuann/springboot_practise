package example;

import example.bean.Car;
import example.bean.Pet;
import example.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 主程序类
 * @SpringBootApplication：这是一个SpringBoot应用
 */
//@RestController
//@EnableAutoConfiguration
@SpringBootApplication

public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);



    }
}


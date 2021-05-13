package example.config;

import example.bean.Car;
import example.bean.Pet;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration

public class ConfigBean {

    @Bean("Oscar")
    public Pet pet01(){
        return new Pet("Oscardog");
    }

}
